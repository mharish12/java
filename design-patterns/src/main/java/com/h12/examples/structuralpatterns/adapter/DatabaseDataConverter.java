package com.h12.examples.structuralpatterns.adapter;

import java.util.List;

public interface DatabaseDataConverter {
  public List<DisplayData3rdParty> convertData(List<DatabaseData> data);
}
