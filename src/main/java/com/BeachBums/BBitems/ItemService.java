package com.BeachBums.BBitems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
 private final ItemRepository itemRepository;

    public ItemService(@Autowired ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getItem() {
        return itemRepository.findAll();
    }

    public Optional<Item> findById(int id){
        return itemRepository.findById(id);
    }

    public void addNewItem(Item item){
        itemRepository.save(item);
    }

    public void delete(Integer id){
        itemRepository.deleteById(id);
    }


}
