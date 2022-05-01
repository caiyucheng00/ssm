import com.cyc.ssm.bean.Appointment;
import com.cyc.ssm.dto.AppointExecution;
import com.cyc.ssm.mapper.AppointmentMapper;
import com.cyc.ssm.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 虚幻的元亨利贞
 * @Description
 * @date 2022-04-29 16:30
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-config.xml"})
public class ServiceTest {
    @Autowired
    private BookService bookService;

    @Autowired
    private AppointmentMapper appointmentMapper;

    @Test
    public void test(){
        AppointExecution appointExecution = bookService.appoint(2, 11118403L);
        System.out.println(appointExecution);

        List<Appointment> appointmentList = appointmentMapper.selectByExample(null);
        System.out.println(appointmentList);
    }
}
