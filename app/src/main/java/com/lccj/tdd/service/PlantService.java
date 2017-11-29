package com.lccj.tdd.service;

import com.lccj.tdd.dao.IPlantDAO;
import com.lccj.tdd.dao.PlantJsonDao;
import com.lccj.tdd.dto.PlantDTO;
import java.util.List;

/**
 * Created by apple on 29/11/17.
 */

public class PlantService implements IPlantService {

  IPlantDAO iPlantDAO;

  public PlantService() {
    iPlantDAO = new PlantJsonDao();
  }

  @Override
  public List<PlantDTO> fetchPlants(String filter) {
    return iPlantDAO.fetchPlants(filter);
  }
}
