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
    
    public static final String ACCOUNT_SID = "AC27546dac35eeca5b83df3f343d141366";
    public static final String AUTH_TOKEN = "afd52c3586c9d2a3ae1b2facbef1c52b";

    public void sendMessage(String message_to_send) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+18572078736"),
                new com.twilio.type.PhoneNumber("+13854627181"),
                message_to_send)
            .create();

        System.out.println(message.getSid());
    }
}
