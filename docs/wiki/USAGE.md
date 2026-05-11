# Carrotato Mechanics & Features

This document provides a technical and gameplay overview of the mechanics introduced in the Carrotato mod.

## 🌿 The Chili Crop (`chili_crop`)

The Chili Crop is the heart of the mod. It follows standard Minecraft crop logic but with its own unique parameters.

### Growth Stages
There are **8 growth stages** (integers 0 through 7). 
- **Stage 0-6**: Growing phases.
- **Stage 7**: Fully mature and ready for harvest.

### Loot Table Logic
- **Immature Harvest**: Dropping an immature plant (Age 0-6) will only yield **1 Chili Seed**.
- **Mature Harvest**: A fully grown plant (Age 7) drops:
    - **1 Chili** (Guaranteed)
    - **1-4 Chili Seeds** (Affected by the Fortune enchantment)
## 🌶️ Item: Chili (`chili`)

### Status Effects: "The Heat"
Every time a player consumes a raw Chili, there is a **50% probability** of receiving the **Spicy** effect.

## 🔥 Status Effect: Spicy (`spicy`)
The Spicy effect is a beneficial status that simulates the body's reaction to intense heat.
- **Fire Resistance**: While the Spicy effect is active, the player is granted **continuous Fire Resistance**.
- **Duration**: Varies by food item (Raw Chili: 10s, Hot Sauce: 30s, Spicy Chili con Carne: 1m).
- **Strategy**: Use spicy foods before entering the Nether or fighting Blazes for a "natural" fire shield.

## 👨‍🍳 Culinary Processing (Phase 2)

...

## 🍲 Advanced Recipes (Phase 3)

Phase 3 introduces complex meals that provide long-lasting Spicy buffs.

### Hot Sauce (`hot_sauce`)
- **Ingredients**: Glass Bottle + Chili Powder + Sugar.
- **Effect**: Spicy for 30 seconds.

### Spicy Chili con Carne (`spicy_chili_con_carne`)
- **Ingredients**: Bowl + Cooked Beef + Raw Chili + Brown Mushroom.
- **Effect**: Spicy II for 1 minute (high nutrition/saturation).

### Spicy Fried Chicken (`spicy_fried_chicken`)
- **Ingredients**: Cooked Chicken + Chili Powder.
- **Effect**: Spicy for 40 seconds.

## 🔗 Compatibility & Tagging
### Dried Chili (`dried_chili`)
- **Processing**: Smelt or Smoke a raw **Chili**.
- **Usage**: A concentrated, shelf-stable version of the chili. It is edible but provides minimal nutrition (1 Nutrition, 0.1 Saturation).
- **Secondary Usage**: Used to craft Chili Powder.

### Chili Powder (`chili_powder`)
- **Processing**: Crafted from a **Dried Chili** in any crafting grid.
- **Usage**: The base spice for advanced recipes. While not edible on its own, it is tagged as a universal spice.

## 🔗 Compatibility & Tagging
Carrotato uses standard conventions (Common Tags) to ensure it works with other culinary mods:
- **`#c:crops`**: Includes the raw Chili.
- **`#c:spices`**: Includes Chili Powder.

## 🗺️ World Generation

### Wild Chili Patches
Chilis are injected into the world using the `random_patch` feature.
- **Biomes**: `minecraft:savanna`, `minecraft:savanna_plateau`, `minecraft:jungle`, `minecraft:sparse_jungle`.
- **Rarity**: Placed with a rarity filter of `32`, meaning they are present but not overwhelming.
- **Spawn State**: Naturally generated chilis always spawn at **Age 7**, allowing immediate harvest by the player.

## 🛠️ Technical Details for Modders
- **Mod ID**: `carrotato`
- **License**: MIT
- **Registry Names**:
    - `carrotato:chili`
    - `carrotato:chili_seeds`
    - `carrotato:chili_crop`
