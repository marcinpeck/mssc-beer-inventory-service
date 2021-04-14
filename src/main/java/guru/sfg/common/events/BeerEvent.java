package guru.sfg.common.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by marcin.peck on 14.04.2021
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent {

    static final long serialVersionUID = -7145637918260528972L;

    private BeerDto beerDto;

}
