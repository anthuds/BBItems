package com.BeachBums.BBitems;


import com.BeachBums.BBitems.dto.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;


    public ItemController(@Autowired ItemService itemService) {
        this.itemService = itemService;

    }

    @GetMapping("/all")
    public List<Item> getItems(){
        return itemService.getItem();
    }



    @GetMapping("/{id}")
    public Optional<Item> findItemById(@PathVariable Integer id ){
       return itemService.findById( id );
    }


    @PostMapping("/all")
    public Item save( @RequestBody Item item )
    {
      itemService.addNewItem(item);
        return item;
    }

    @PutMapping( "/{id}" )
    public void addItem( @RequestBody ItemDto itemDto, @PathVariable Integer id )
    {
        Item item = itemService.findById( id ).get();
        item.setName( itemDto.getName() );
        item.setDescription( itemDto.getDescription() );
        item.setImage( itemDto.getImage() );
        item.setPrice( itemDto.getPrice() );
        itemService.addNewItem( item );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        itemService.delete( id );
    }

}
