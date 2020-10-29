package mocking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

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