package me.woder.network;

import java.io.IOException;

import me.woder.bot.Client;

import com.google.common.io.ByteArrayDataInput;

public class ChatMessage02 extends Packet{
    public ChatMessage02(Client c) {
        super(c);
    }
    
    @Override
    public void read(Client c, int len, ByteArrayDataInput buf) throws IOException{
        String messages = getString(buf);
        c.chat.formatMessage(messages);       
    }

}
