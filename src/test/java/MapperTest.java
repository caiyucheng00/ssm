import com.cyc.ssm.bean.Book;
import com.cyc.ssm.mapper.BookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 虚幻的元亨利贞
 * @Description
 * @date 2022-03-31 20:51
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-config.xml"})
public class MapperTest {

    @Autowired
    BookMapper bookMapper;

    @Test
    public void testQuery(){

        List<Book> bookList = bookMapper.selectByExample(null);
        for(Book book:bookList){
            System.out.println(book);
        }
    }
}
