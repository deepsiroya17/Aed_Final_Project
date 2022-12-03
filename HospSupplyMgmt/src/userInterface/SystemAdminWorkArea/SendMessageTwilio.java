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
    
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public void sendMessage(String message_to_send, String phone_num_to_send) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(phone_num_to_send),
                new com.twilio.type.PhoneNumber("+18578872899"),
                message_to_send)
            .create();

        System.out.println(message.getSid());
    }
}
