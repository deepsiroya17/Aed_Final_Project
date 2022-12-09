/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdminWorkArea;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author asus
 */
public class SendMessageTwilio {
    
    public static final String ACCOUNT_SID = "ACa4999d815759a1234cb0c043426b7f41";
    public static final String AUTH_TOKEN = "6f7bdeed2487011e77a673d4fb5f5ba0";

    public void sendMessage(String message_to_send, String phone_num_to_send) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(phone_num_to_send),
                new com.twilio.type.PhoneNumber("+14433451423"),
                message_to_send)
            .create();

        System.out.println(message.getSid());
    }
}
