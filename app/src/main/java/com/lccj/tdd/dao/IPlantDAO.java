package com.lccj.tdd.dao;

import com.lccj.tdd.dto.PlantDTO;
import java.util.List;


/**
 * A collection of methods to acess plant data.
 */
public interface IPlantDAO {

  /**
   * Accept filter text, and return a collection of plants that contain that filter text.
   * @param filter the text we want to match in our returned list of plants.
   * @return a list of plants that contain the given filter text in either genus, species, cultivar, or common name.
   */

   List<PlantDTO> fetchPlants(String filter);

}
