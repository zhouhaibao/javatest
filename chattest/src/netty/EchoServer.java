package netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import netty.example.EchoServerHandler;

/**
 * @author zhouhaibao
 * @date 2020/12/11 15:32
 */
public class EchoServer {

    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public void start() throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        ServerBootstrap b = new ServerBootstrap();
        //Specifies NIO transport, local socket address
        //Adds handler to channel pipeline
        b.group(group).channel(NioServerSocketChannel.class).localAddress(port)
                .childHandler(new ChannelInitializer<Channel>() {
                    @Override
                    protected void initChannel(Channel ch) throws Exception {
                        ch.pipeline().addLast(new DelimiterBasedFrameDecoder(Integer.MAX_VALUE, Delimiters.lineDelimiter()[0]));
                        ch.pipeline().addLast(new EchoServerHandler());
                    }
                });
        //Binds server, waits for server to close, and releases resources
        ChannelFuture f = b.bind().sync();
        System.out.println(EchoServer.class.getName() + "started and listen on " + f.channel().localAddress());
        f.channel().closeFuture().sync();
    }

    public static void main(String[] args) throws InterruptedException {
        new EchoServer(65535).start();
    }
}
