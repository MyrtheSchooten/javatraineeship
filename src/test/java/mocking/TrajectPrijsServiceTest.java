package mocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TrajectPrijsServiceTest {
    @Mock
    private TrajectNaarTrajectEenhedenService trajectNaarTrajectEenhedenService;

    @Mock
    private TrajectEenhedenNaarPrijsService trajectEenhedenNaarPrijsService;

    @InjectMocks
    private TrajectPrijsService trajectPrijsService;

    @Test
    void getTrajectPrijsTest() {

        when(trajectNaarTrajectEenhedenService.getTrajectEenheden(anyString(), anyString())).thenReturn(13);
        when(trajectEenhedenNaarPrijsService.getPriceTrajectEenheden(eq(13))).thenReturn(2);

        int prijs = trajectPrijsService.getTrajectPrijs("Apeldoorn", "Utrecht");
        assertThat(prijs, is(26));
    }


    @Test
    void invalidLocationExceptionTest() throws InvalidLocationException {

        when(trajectNaarTrajectEenhedenService.getTrajectEenheden(eq("Geen stad"), anyString())).thenThrow(InvalidLocationException.class);
        assertThrows(InvalidLocationException.class, () -> trajectPrijsService.getTrajectPrijs("Geen stad", "Wel een stad"));

    }
}