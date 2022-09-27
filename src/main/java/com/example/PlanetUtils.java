package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class PlanetUtils {

  public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
    List<Planet> beginningWithM = planets.stream()
            .filter(planet -> planet.getName()
                    .startsWith("M")).collect(Collectors.toList());
    return beginningWithM;
  }

  public List<Planet> getPlanetsWithRings(List<Planet> planets) {
    List<Planet> withRings = planets.stream()
            .filter(planet -> planet.getHasRings())//.filter(Planet::getHasRings)
            .collect(Collectors.toList());
    return withRings;
  }

  public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
    return planets.stream()
            .filter(planet -> planet.getNumberOfMoons() > 3)
            .collect(Collectors.toList());
  }

  public List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
    List<Planet> withDensityGreaterThanFive = planets.stream()
            .filter(planet -> planet.getDensity() > 5.00)
            .filter(planet -> planet.getNumberOfMoons() > 3)
            .collect(Collectors.toList());
    return withDensityGreaterThanFive;

  }


}
