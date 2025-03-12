package pl.bicyclerental.model;

import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class BicycleStation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @JoinColumn(name = "station_id")
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Set<Bicycle> bicycles;

  @JoinColumn(name = "station_id")
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Set<BicycleStand> bicycleStands;
}
