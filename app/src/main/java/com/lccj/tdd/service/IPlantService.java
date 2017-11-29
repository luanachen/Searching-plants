package com.lccj.tdd.service;

import com.lccj.tdd.dto.PlantDTO;
import java.util.List;

/**
 * Business logic for fetching and managing plants.
 */

public interface IPlantService {

  /**
   * Return a collection of plants that contain that filter text.
   * @param filter the text we want to match in our returned list of plants.
   * @return a list of plants that contain the given filter text in either genus, species, cultivar, or common name.
   */
  List<PlantDTO> fetchPlants(String filter);
}

