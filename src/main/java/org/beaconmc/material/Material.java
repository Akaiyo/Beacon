/**	
 * Beacon - Open Source Minecraft Server
 * Copyright (C) 2014  podpage
 * Copyright (C) 2014  Blazecube
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * @author podpage
 */
 package org.beaconmc.material;

import com.google.common.collect.Maps;
import lombok.Getter;

import java.util.HashMap;

public enum Material {

			//BLOCKS
			AIR(0, "air"),
			STONE(1, "stone"),
			GRASS(2, "grass"),
			DIRT(3, "dirt"),
			COBBLESTONE(4, "cobblestone"),
			WOOD(5, "planks"),
			SAPLING(6, "sapling"),
			BADROCK(7, "badrock"),
			WATER_FLOWING(8, "flowing_water"),
			WATER(9, "water"),
			LAVA_FLOWING(10, "flowing_lava"),
			LAVA(11, "lava"),
			SAND(12, "sand"),
			GRAVEL(13, "gravel"),
			GOLD_ORE(14, "gold_ore"),
			IRON_ORE(15, "iron_ore"),
			COAL_ORE(16, "coal_ore"),
			LOG(17, "log"),
			LEAVES(18, "leaves"),
			SPONGE(19, "sponge"),
			GLASS(20, "glass"),
			LAPIS_ORE(21, "lapis_ore"),
			LAPIS_BLOCK(22, "lapis_block"),
			DISPENSER(23, "dispenser"),
			SANDSTONE(24, "sandstone"),
			NOTE_BLOCK(25, "note_block"),
			BED_BLOCK(26, "bed"),
			POWERED_RAIL(27, "golden_rail"),
			DETECTOR_RAIL(28, "detector_rail"),
			PISTON_STICKY(29, "sticky_piston"),
			WEB(30, "web"),
			LONG_GRASS(31, "tallgrass"),
			DEAD_BUSH(32, "deadbush"),
			PISTON(33, "piston"),
			PISTON_HEAD(34, "piston_head"),
			WOOL(35, "wool"),
			PISTON_EXTENSION(36, "piston_extension"),
			YELLOW_FLOWER(37, "yellow_flower"),
			RED_ROSE(38, "red_rose"),
			BROWN_MUSHROOM(39, "brown_mushroom"),
			RED_MUSHROOM(40, "red_mushroom"),
			GOLD_BLOCK(41, "gold_block"),
			IRON_BLOCK(42, "iron_block"),
			STEP_DOUBLE_STONE(43, "double_stone_slab"),
			STEP_STONE(44, "stone_slab"),
			BRICK_BLOCK(45, "brick_block"),
			TNT(46, "tnt"),
			BOOKSHELF(47, "bookshelf"),
			MOSSY_COBBLESTONE(48, "mossy_cobblestone"),
			OBSIDIAN(49, "obsidian"),
			TORCH(50, "torch"),
			FIRE(51, "fire"),
			MOB_SPAWNER(52, "mob_spawner"),
			STAIRS_OAK(53, "oak_stairs"),
			CHEST(54, "chest"),
			REDSTONE_WIRE(55, "redstone_wire"),
			DIAMOND_ORE(56, "diamond_ore"),
			DIAMOND_BLOCK(57, "diamond_block"),
			WORKBENCH(58, "crafting_table"),
			WHEAT_BLOCK(59, "wheat"), //TODO #SuperAwesomeMojangCode
			FARMLAND(60, "farmland"),
			FURNACE(61, "furnace"),
			FURNACE_LIT(62, "lit_furnace"),
			SIGN_STANDING(63, "standing_sign"),
			DOOR_OAK(64, "wooden_door"), //
			LADDER(65, "ladder"),
			RAILS(66, "rail"),
			STAIRS_COBBLESTONE(67, "stone_stairs"),
			SIGN_WALL(68, "wall_sign"),
			LEVER(69, "lever"),
			PRESSURE_PLATE_STONE(70, "stone_pressure_plate"),
			DOOR_IRON(71, "iron_door"),
			PRESSURE_PLATE_WOOD(72, "wooden_pressure_plate"),
			REDSTONE_ORE(73, "redstone_ore"),
			REDSTONE_ORE_LIT(74, "lit_redstone_ore"),
			REDSTONE_TORCH_OFF(75, "unlit_redstone_torch"),
			REDSTONE_TORCH_ON(76, "redstone_torch"),
			BUTTON_STONE(77, "stone_button"), //
			SNOW_LAYER(78, "snow_layer"),
			ICE(79, "ice"),
			SNOW(80, "snow_block"),
			CACTUS(81, "cactus"),
			CLAY(82, "clay"),
			SUGAR_CANE_BLOCK(83, "reeds"),
			JUKEBOX(84, "jukebox"),
			FENCE_OAK(85, "fence"),
			PUMPKIN(86, "pumpkin"),
			NETHERRACK(87, "netherrack"),
			SOUL_SAND(88, "soul_sand"),
			GLOWSTONE(89, "glowstone"),
			PORTAL(90, "portal"),
			JACK_O_LANTERN(91, "lit_pumpkin"),
			CAKE_BLOCK(92, "cake"),
			REPEATER_BLOCK_OFF(93, "unpowered_repeater"),
			REPEATER_BLOCK_ON(94, "powered_repeater"),
			STAINED_GLASS(95, "stained_glass"), //
			TRAPDOOR_WOOD(96, "trapdoor"),
			MONSTER_EGG_BLOCK(97, "monster_egg"),
			STONEBRICK(98, "stonebrick"),
			MUSHROOM_BLOCK_RED(99, "brown_mushroom_block"),
			MUSHROOM_BLOCK_BROWN(100, "red_mushroom_block"),
			IRON_BARS(101, "iron_bars"),
			GLASS_PANE(102, "glass_pane"),
			MELON_BLOCK(103, "melon_block"),
			PUMPKIN_STEM(104, "pumpkin_stem"),
			MELON_STEM(105, "melon_stem"),
			VINE(106, "vine"),
			FENCE_GATE_OAK(107, "fence_gate"),
			STAIRS_BRICK(108, "brick_stairs"),
			STAIRS_STONEBRICK(109, "stone_brick_stairs"),
			MYCELIUM(110, "mycelium"),
			WATERLILY(111, "waterlily"), //
			NETHER_BRICK(112, "nether_brick"),
			FENCE_NETHER(113, "nether_fence"), //
			STAIRS_NETHER_BRICK(114, "nether_brick_stairs"), //
			NETHER_WART(115, "nether_wart"),
			ENCHANTMENT_TABLE(116, "enchantment_table"),
			BREWING_STAND(117, "brewing_stand"),
			CAULDRON(118, "cauldron"),
			END_PORTAL(119, "end_portal"),
			END_PORTAL_FRAME(120, "end_portal_frame"),
			END_STONE(121, "end_stone"),
			DRAGON_EGG(122, "dragon_egg"),
			REDSTONE_LAMP_OFF(123, "redstone_lamp"),
			REDSTONE_LAMP_ON(124, "lit_redstone_lamp"),
			DOUBLE_STEP_WOOD(125, "double_wooden_slab"),
			STEP_WOOD(126, "wooden_slab"),
			COCOA(127, "cocoa"),
			STAIRS_SANDSTONE(128, "sandstone_stairs"),
			EMERALD_ORE(129, "emerald_ore"),
			ENDER_CHEST(130, "ender_chest"),
			TRIPWIRE_HOOK(131, "tripwire_hook"),
			TRIPWIRE(132, "tripwire"),
			EMERALD_BLOCK(133, "emerald_block"),
			STAIRS_SPRUCE(134, "spruce_stairs"),
			STAIRS_BIRCH(135, "birch_stairs"),
			STAIRS_JUNGLE(136, "jungle_stairs"),
			COMMAND_BLOCK(137, "command_block"),
			BEACON(138, "beacon"),
			COBBLESTONE_WALL(139, "cobblestone_wall"),
			FLOWER_POT(140, "flower_pot"),
			CARROTS(141, "carrots"),
			POTATOES(142, "potatoes"),
			BUTTON_WOOD(143, "wooden_button"), //
			SKULL(144, "skull"),
			ANVIL(145, "anvil"),
			TRAPPED_CHEST(146, "trapped_chest"),
			PRESSURE_PLATE_GOLD(147, "light_weighted_pressure_plate"),
			PRESSURE_PLATE_IRON(148, "heavy_weighted_pressure_plate"),
			REDSTONE_COMPARATOR_OFF(149, "unpowered_comparator"),
			REDSTONE_COMPARATOR_ON(150, "powered_comparator"),
			DAYLIGHT_DETECTOR(151, "daylight_detector"),
			REDSTONE_BLOCK(152, "redstone_block"),
			QUARTZ_ORE(153, "quartz_ore"),
			HOPPER(154, "hopper"),
			QUARTZ_BLOCK(155, "quartz_block"),
			STAIRS_QUARTZ(156, "quartz_stairs"),
			ACTIVATOR_RAIL(157, "activator_rail"),
			DROPPER(158, "dropper"),
			STAINED_CLAY(159, "stained_hardened_clay"),
			STAINED_GLASS_PANE(160, "stained_glass_pane"), //
			LEAVES_2(161, "leaves2"),
			LOG_2(162, "log2"),
			STAIRS_ACACIA(163, "acacia_stairs"),
			STAIRS_DARK_OA_(164, "dark_oak_stairs"),
			SLIMEBLOCK(165, "slime"),
			BARRIER(166, "barrier"),
			TRAPDOOR_IRON(167, "iron_trapdoor"),
			PRISMARINE(168, "prismarine"),
			SEA_LANTERN(169, "sea_lantern"),
			HAY_BLOCK(170, "hay_block"),
			CARPET(171, "carpet"),
			HARDENED_CLAY(172, "hardened_clay"),
			COAL_BLOCK(173, "coal_block"),
			PACKED_ICE(174, "packed_ice"),
			DOUBLE_PLANT(175, "double_plant"),
			BANNER_STANDING(176, "standing_banner"),
			BANNER_WALL(177, "wall_banner"),
			DAYLIGHT_DETECTOR_INVERTED(178, "daylight_detector_inverted"),
			SANDSTONE_RED(179, "red_sandstone"), //
			FENCE_GATE_SPRUCE(183, "spruce_fence_gate"),
			FENCE_GATE_BIRCH(184, "birch_fence_gate"),
			FENCE_GATE_JUNGLE(185, "jungle_fence_gate"),
			FENCE_GATE_DARK_OAK(186, "dark_oak_fence_gate"),
			FENCE_GATE_ACACIA(187, "acacia_fence_gate"),
			FENCE_SPRUCE(188, "spruce_fence"),
			FENCE_BIRCH(189, "birch_fence"),
			FENCE_JUNGLE(190, "jungle_fence"),
			FENCE_DARK_OAK(191, "dark_oak_fence"),
			FENCE_ACACIA(192, "acacia_fence"),
			DOOR_SPRUCE(193, "spruce_door"),
			DOOR_BIRCH(194, "birch_door"),
			DOOR_JUNGLE(195, "jungle_door"),
			DOOR_ACACIA(196, "acacia_door"),
			DOOR_DARK_OAK(197, "dark_oak_door"),
			
			//ITEMS
			IRON_SHOVEL(256, "iron_shovel"),
			IRON_PICKAXE(257, "iron_pickaxe"),
			IRON_AXE(258, "iron_axe"),
			FLINT_AND_STEEL(259, "flint_and_steel"),
			APPLE(260, "apple"),
			BOW(261, "bow"),
			ARROW(262, "arrow"),
			COAL(263, "coal"),
			DIAMOND(264, "diamond"),
			IRON_INGOT(265, "iron_ingot"), //
			GOLD_INGOT(266, "gold_ingot"), //
			IRON_SWORD(267, "iron_sword"),
			WOODEN_SWORD(268, "wooden_sword"),
			WOODEN_SPADE(269, "wooden_spade"),
			WOODEN_PICKAXE(270, "wooden_pickaxe"),
			WOODEN_AXE(271, "wooden_axe"),
			STONE_SWORD(272, "stone_sword"),
			STONE_SPADE(273, "stone_spade"),
			STONE_PICKAXE(274, "stone_pickaxe"),
			STONE_AXE(275, "stone_axe"),
			DIAMOND_SWORD(276, "diamond_sword"),
			DIAMOND_SPADE(277, "diamond_spade"),
			DIAMOND_PICKAXE(278, "diamond_pickaxe"),
			DIAMOND_AXE(279, "diamond_axe"),
			STICK(280, "stick"),
			BOWL(281, "bowl"),
			MUSHROOM_SOUP(282, "mushroom_soup"),
			GOLDEN_SWORD(283, "golden_sword"),
			GOLDEN_SPADE(284, "golden_spade"),
			GOLDEN_PICKAXE(285, "golden_pickaxe"),
			GOLDEN_AXE(286, "golden_axe"),
			STRING(287, "string"),
			FEATHER(288, "feather"),
			GUNPOWDER(289, "gunpowder"),
			WOODEN_HOE(290, "wooden_hoe"),
			STONE_HOE(291, "stone_hoe"),
			IRON_HOE(292, "iron_hoe"),
			DIAMOND_HOE(293, "diamond_hoe"),
			GOLDEN_HOE(294, "golden_hoe"),
			SEEDS(295, "wheat_seeds"), //
			WHEAT(296, "wheat"), //TODO #SuperAwesomeMojangCode
			BREAD(297, "bread"),
			LEATHER_HELMET(298, "leather_helmet"),
			LEATHER_CHESTPLATE(299, "leather_chestplate"),
			LEATHER_LEGGINGS(300, "leather_leggings"),
			LEATHER_BOOTS(301, "leather_boots"),
			CHAINMAIL_HELMET(302, "chainmail_helmet"),
			CHAINMAIL_CHESTPLATE(303, "chainmail_chestplate"),
			CHAINMAIL_LEGGINGS(304, "chainmail_leggings"),
			CHAINMAIL_BOOTS(305, "chainmail_boots"),
			IRON_HELMET(306, "iron_helmet"),
			IRON_CHESTPLATE(307, "iron_chestplate"),
			IRON_LEGGINGS(308, "iron_leggings"),
			IRON_BOOTS(309, "iron_boots"),
			DIAMOND_HELMET(310, "diamond_helmet"),
			DIAMOND_CHESTPLATE(311, "diamond_chestplate"),
			DIAMOND_LEGGINGS(312, "diamond_leggings"),
			DIAMOND_BOOTS(313, "diamond_boots"),
			GOLDEN_HELMET(314, "golden_helmet"),
			GOLDEN_CHESTPLATE(315, "golden_chestplate"),
			GOLDEN_LEGGINGS(316, "golden_leggings"),
			GOLDEN_BOOTS(317, "golden_boots"),
			FLINT(318, "flint"),
			PORKCHOP(319, "porkchop"),
			PORKCHOP_COOKED(320, "cooked_porkchop"),
			PAINTING(321, "painting"),
			GOLDEN_APPLE(322, "golden_apple"),
			SIGN(323, "sign"),
			DOOR_OAK_ITEM(324, "wooden_door"),
			BUCKET(325, "bucket"),
			BUCKET_WATER(326, "water_bucket"), //
			BUCKET_LAVA(327, "lava_bucket"), //
			MINECART(328, "minecart"),
			SADDLE(329, "saddle"),
			DOOR_IRON_ITEM(330, "iron_door"), //TODO #SuperAwesomeMojangCode
			REDSTONE(331, "redstone"),
			SNOWBALL(332, "snowball"),
			BOAT(333, "boat"),
			LEATHER(334, "leather"),
			BUCKET_MILK(335, "milk_bucket"),
			BRICK_ITEM(336, "brick"),
			CLAY_BALL(337, "clay_ball"),
			SUGAR_CANE(338, "reeds"),
			PAPER(339, "paper"),
			BOOK(340, "book"),
			SLIMEBALL(341, "slimeball"),
			MINECART_CHEST(342, "chest_minecart"),
			MINECART_FURNANCE(343, "furnace_minecart"),
			EGG(344, "egg"),
			COMPASS(345, "compass"),
			FISHING_ROD(346, "fishing_rod"),
			CLOCK(347, "clock"),
			GLOWSTONE_DUST(348, "glowstone_dust"),
			FISH(349, "fish"),
			FISH_COOKED(350, "cooked_fished"),
			DYE(351, "dye"),
			BONE(352, "bone"),
			SUGAR(353, "sugar"),
			CAKE(354, "cake"),
			BED(355, "bed"),
			REPEATER(356, "repeater"),
			COOKIE(357, "cookie"),
			MAP(358, "filled_map"), //
			SHEARS(359, "shears"),
			MELON(360, "melon"),
			PUMPKIN_SEEDS(361, "pumpkin_seeds"),
			MELON_SEEDS(362, "melon_seeds"),
			BEEF(363, "beef"),
			BEEF_COOKED(364, "cooked_beef"),
			CHICKEN(365, "chicken"),
			CHICKEN_COOKED(366, "cooked_chicken"),
			ROTTEN_FLESH(367, "rotten_flesh"),
			ENDER_PEARL(368, "ender_pearl"),
			BLAZE_ROD(369, "blaze_rod"),
			GHAST_TEAR(370, "ghast_tear"),
			GOLD_NUGGET(371, "gold_nugget"),
			NETHER_WART_BLOCK(372, "nether_wart"),
			POTION(373, "potion"),
			GLASS_BOTTLE(374, "glass_bottle"),
			SPIDER_EYE(375, "spider_eye"),
			FERMENTED_SPIDER_EYE(376, "fermented_spider_eye"),
			BLAZE_POWDER(377, "blaze_powder"),
			MAGMA_CREAM(378, "magma_cream"),
			BREWING_STAND_ITEM(379, "brewing_stand"),
			CAULDRON_ITEM(380, "cauldron"),
			ENDER_EYE(381, "ender_eye"),
			MELON_SPECKLED(382, "speckled_melon"),
			SPAWN_EGG(383, "spawn_egg"),
			EXPERIENCE_BOTTLE(384, "experience_bottle"),
			FIRE_CHARGE(385, "fire_charge"),
			BOOK_WRITEABLE(386, "writable_book"), //
			BOOK_WRITTEN(387, "written_book"), //
			EMERALD(388, "emerald"),
			ITEM_FRAME(389, "item_frame"),
			FLOWER_POT_ITEM(390, "flower_pot"),
			CARROT(391, "carrot"),
			POTATO(392, "potato"),
			BAKED_POTATO(393, "baked_potato"),
			POISONOUS_POTATO(394, "poisonous_potato"),
			EMPTY_MAP(395, "map"),
			GOLDEN_CARROT(396, "golden_carrot"),
			SKULL_ITEM(397, "skull"),
			CARROT_ON_A_STICK(398, "carrot_on_a_stick"),
			NETHER_STAR(399, "nether_star"),
			PUMPKIN_PIE(400, "pumpkin_pie"),
			FIREWORK(401, "firework"),
			FIREWORK_CHARGE(402, "firework_charge"),
			BOOK_ENCHANTED(403, "enchanted_book"),
			COMPARATOR(404, "comparator"),
			NETHER_BRICK_(405, "netherbrick"),
			QUARTZ(406, "quartz"),
			MINECART_TNT(407, "tnt_minecart"),
			MINECART_HOPPER(408, "hopper_minecart"),
			PRISMARINE_SHARD(409, "prismarine_shard"),
			PRISMARINE_CRYSTALS(410, "prismarine_crystals"),
			RABBIT(411, "rabbit"),
			RABBIT_COOKED(412, "cooked_rabbit"),
			RABBIT_STEW(413, "rabbit_stew"),
			RABBIT_FOOT(414, "rabbit_foot"),
			RABBIT_HIDE(415, "rabbit_hide"),
			ARMOR_STAND(416, "armor_stand"),
			HORSE_ARMOR_IRON(417, "iron_horse_armor"),
			HORSE_ARMOR_GOLD(418, "golden_horse_armor"),
			HORSE_ARMOR_DIAMOND(419, "diamond_horse_armor"),
			LEAD(420, "lead"),
			NAME_TAG(421, "name_tag"),
			MINECART_COMMAND_BLOCK(422, "command_block_minecart"),
			MUTTON(423, "mutton"),
			MUTTON_COOKED(424, "cooked_mutton"),
			BANNER(425, "banner"),
			DOOR_SPRUCE_ITEM(427, "spruce_door"),
			DOOR_BIRCH_ITEM(428, "birch_door"),
			DOOR_JUNGLE_ITEM(429, "jungle_door"),
			DOOR_ACACIA_ITEM(430, "acacia_door"),
			DOOR_DARK_OAK_ITEM(431, "dark_oak_door"),
			DISC_13(2256, "record_13"),
			DISC_CAT(2257, "record_cat"),
			DISC_BLOCKS(2258, "record_blocks"),
			DISC_CHIRP(2259, "record_chirp"),
			DISC_FAR(2260, "record_far"),
			DISC_MALL(2261, "record_mall"),
			DISC_MELLOHI(2262, "record_mellohi"),
			DISC_STAL(2263, "record_stal"),
			DISC_STARD(2264, "record_strad"),
			DISC_WARD(2265, "record_ward"),
			DISC_11(2266, "record_11"),
			DISC_WAIT(2267, "record_wait");

	private static final HashMap<Integer, Material> BY_LEGACYID = Maps.newHashMap();
	private static final HashMap<String, Material> BY_ID = Maps.newHashMap();

	@Getter
	private int legacyId;
	@Getter
	private String id;
	@Getter
	private int maxStackSize;
	@Getter
	private short durability;

	@Getter
	private boolean item;

	private Material(int legacyId, String id) {
		this(legacyId, id, 64, (short) 0, false);
	}

	private Material(int legacyId, String id, int maxStackSize, short durability, boolean item) {
		this.legacyId = legacyId;
		this.id = id;
		this.maxStackSize = maxStackSize;
		this.durability = durability;
		this.item = item;
	}

	static {
		for (Material material : values()) {
			BY_LEGACYID.put(material.getLegacyId(), material);
			BY_ID.put(material.getId(), material);
		}
	}

	public static Material byID(String id) {
		return BY_ID.get(id.toLowerCase());
	}

	public static Material byID(int legacyId) {
		return BY_LEGACYID.get(legacyId);
	}

}
