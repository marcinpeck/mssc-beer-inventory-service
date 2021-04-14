package guru.sfg.common.events;

import lombok.NoArgsConstructor;

/**
 * Created by marcin.peck on 14.04.2021
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent{

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
