import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MainApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MailSender mailSender = (MailSender) context.getBean("mailSender2");
        System.out.println("Sending text...");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("h.nguyen03101996@gmail.com");
        message.setTo("nguyenviethuynh1996.vih@gmail.com");
        message.setSubject("Subject");
        message.setText("thang cong vang doi 2");
        //sending message
        mailSender.send(message);
        System.out.println("Sending text done!!!");
        context.close();
    }
}
