package belmoz.dializ.pacient.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"vaccinated", "dates"})
public class HepatitisVaccination {
	boolean vaccinated;
	List<LocalDateTime> dates;
}
