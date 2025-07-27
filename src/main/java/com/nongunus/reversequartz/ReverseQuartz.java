package com.nongunus.reversequartz;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ReverseQuartz extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ReverseQuartz has been enabled!");
        NamespacedKey key = new NamespacedKey(this, "reverse_quartz");
        ShapelessRecipe recipe = new ShapelessRecipe(key, new ItemStack(Material.QUARTZ, 4));
        recipe.addIngredient(Material.QUARTZ_BLOCK);
        getServer().addRecipe(recipe);
    }
}
