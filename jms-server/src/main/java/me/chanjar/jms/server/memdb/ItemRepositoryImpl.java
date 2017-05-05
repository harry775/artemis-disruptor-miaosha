package me.chanjar.jms.server.memdb;

import java.util.HashMap;
import java.util.Map;

public class ItemRepositoryImpl implements ItemRepository {

  private final Map<Long, Item> data = new HashMap<>(1000);

  @Override
  public void put(Item item) {
    data.put(item.getId(), item);
  }

  @Override
  public Item get(Long id) {
    return data.get(id);
  }

}
