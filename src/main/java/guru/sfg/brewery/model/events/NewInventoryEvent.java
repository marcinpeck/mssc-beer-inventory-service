package guru.sfg.brewery.model.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by marcin.peck on 14.04.2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewInventoryEvent{
    static final long serialVersionUID = -5781515597148163111L;
    private BeerDto beerDto;
}
