import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookSpyTestTest {





    @Test
    void addtoarray() {
     BookSpyTest listSpy = spy(new BookSpyTest());

      listSpy.addtoarray("Java for Experts");

      List<String> m = listSpy.getL();



      assertEquals(4, m.size());



        verify(listSpy,times(1)).addtoarray("Java for Experts");



        assertEquals("Java for Experts", m.get(3));


    }



}