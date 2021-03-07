public class SetBonusConfigGenerator {
    public static void main (String[] args) {
        String[] weaponlist = {
                "spartanweaponry:dagger_lead",
                "spartanweaponry:dagger_nickel",
                "spartanweaponry:dagger_electrum",
                "spartanweaponry:dagger_platinum",
                "spartanweaponry:dagger_invar",
                "spartanweaponry:dagger_silver",
                "spartanweaponry:dagger_steel",
                "spartanweaponry:dagger_bronze",
                "spartanweaponry:dagger_tin",
                "spartanweaponry:dagger_copper",
                "spartanweaponry:dagger_diamond",
                "spartanweaponry:dagger_gold",
                "spartanweaponry:dagger_iron",
                "spartanweaponry:dagger_stone",
                "spartanweaponry:dagger_wood",
                "spartanfire:dagger_fire_dragonsteel",
                "spartanfire:dagger_ice_dragonsteel",
                "spartanfire:dagger_desert_venom",
                "spartanfire:dagger_desert",
                "spartanfire:dagger_jungle_venom",
                "spartanfire:dagger_jungle",
                "spartanfire:dagger_ice_dragonbone",
                "spartanfire:dagger_fire_dragonbone",
                "spartanfire:dagger_dragonbone",
                "spartanfire:longsword_fire_dragonsteel",
                "spartanweaponry:longsword_wood",
                "spartanweaponry:longsword_stone",
                "spartanweaponry:longsword_iron",
                "spartanweaponry:longsword_gold",
                "spartanweaponry:longsword_diamond",
                "spartanweaponry:longsword_copper",
                "spartanweaponry:longsword_tin",
                "spartanweaponry:longsword_bronze",
                "spartanweaponry:longsword_steel",
                "spartanweaponry:longsword_silver",
                "spartanweaponry:longsword_invar",
                "spartanweaponry:longsword_platinum",
                "spartanweaponry:longsword_electrum",
                "spartanweaponry:longsword_nickel",
                "spartanweaponry:longsword_lead",
                "spartanfire:longsword_fire_dragonsteel",
                "spartanfire:longsword_desert_venom",
                "spartanfire:longsword_jungle_venom",
                "spartanfire:longsword_desert",
                "spartanfire:longsword_jungle",
                "spartanfire:longsword_ice_dragonbone",
                "spartanfire:longsword_fire_dragonbone",
                "spartanfire:longsword_dragonbone",
                "spartanfire:longsword_ice_dragonsteel",
                "spartanweaponry:katana_wood",
                "spartanweaponry:katana_stone",
                "spartanweaponry:katana_iron",
                "spartanweaponry:katana_gold",
                "spartanweaponry:katana_diamond",
                "spartanweaponry:katana_copper",
                "spartanweaponry:katana_tin",
                "spartanweaponry:katana_bronze",
                "spartanweaponry:katana_steel",
                "spartanweaponry:katana_silver",
                "spartanweaponry:katana_invar",
                "spartanweaponry:katana_platinum",
                "spartanweaponry:katana_electrum",
                "spartanweaponry:katana_nickel",
                "spartanweaponry:katana_lead",
                "spartanfire:katana_fire_dragonsteel",
                "spartanfire:katana_ice_dragonsteel",
                "spartanfire:katana_desert_venom",
                "spartanfire:katana_dragonbone",
                "spartanfire:katana_fire_dragonbone",
                "spartanfire:katana_ice_dragonbone",
                "spartanfire:katana_jungle",
                "spartanfire:katana_desert",
                "spartanfire:katana_jungle_venom",
                "spartanfire:saber_fire_dragonsteel",
                "spartanweaponry:saber_wood",
                "spartanweaponry:saber_stone",
                "spartanweaponry:saber_iron",
                "spartanweaponry:saber_gold",
                "spartanweaponry:saber_diamond",
                "spartanweaponry:saber_copper",
                "spartanweaponry:saber_tin",
                "spartanweaponry:saber_bronze",
                "spartanweaponry:saber_steel",
                "spartanweaponry:saber_silver",
                "spartanweaponry:saber_invar",
                "spartanweaponry:saber_platinum",
                "spartanweaponry:saber_electrum",
                "spartanweaponry:saber_nickel",
                "spartanweaponry:saber_lead",
                "spartanfire:saber_fire_dragonsteel",
                "spartanfire:saber_ice_dragonsteel",
                "spartanfire:saber_desert_venom",
                "spartanfire:saber_jungle_venom",
                "spartanfire:saber_fire_dragonbone",
                "spartanfire:saber_ice_dragonbone",
                "spartanfire:saber_jungle",
                "spartanfire:saber_desert",
                "spartanfire:saber_dragonbone",
                "spartanfire:rapier_fire_dragonsteel",
                "spartanweaponry:rapier_wood",
                "spartanweaponry:rapier_stone",
                "spartanweaponry:rapier_iron",
                "spartanweaponry:rapier_gold",
                "spartanweaponry:rapier_diamond",
                "spartanweaponry:rapier_copper",
                "spartanweaponry:rapier_tin",
                "spartanweaponry:rapier_bronze",
                "spartanweaponry:rapier_steel",
                "spartanweaponry:rapier_silver",
                "spartanweaponry:rapier_platinum",
                "spartanweaponry:rapier_invar",
                "spartanweaponry:rapier_electrum",
                "spartanweaponry:rapier_nickel",
                "spartanweaponry:rapier_lead",
                "spartanfire:rapier_fire_dragonsteel",
                "spartanfire:rapier_ice_dragonsteel",
                "spartanfire:rapier_desert_venom",
                "spartanfire:rapier_jungle_venom",
                "spartanfire:rapier_desert",
                "spartanfire:rapier_jungle",
                "spartanfire:rapier_ice_dragonbone",
                "spartanfire:rapier_fire_dragonbone",
                "spartanfire:rapier_dragonbone",
                "spartanweaponry:greatsword_wood",
                "spartanweaponry:greatsword_stone",
                "spartanweaponry:greatsword_iron",
                "spartanweaponry:greatsword_gold",
                "spartanweaponry:greatsword_diamond",
                "spartanweaponry:greatsword_copper",
                "spartanweaponry:greatsword_tin",
                "spartanweaponry:greatsword_bronze",
                "spartanweaponry:greatsword_steel",
                "spartanweaponry:greatsword_silver",
                "spartanweaponry:greatsword_invar",
                "spartanweaponry:greatsword_platinum",
                "spartanweaponry:greatsword_electrum",
                "spartanweaponry:greatsword_nickel",
                "spartanweaponry:greatsword_lead",
                "spartanfire:greatsword_fire_dragonsteel",
                "spartanfire:greatsword_ice_dragonsteel",
                "spartanfire:greatsword_desert_venom",
                "spartanfire:greatsword_jungle_venom",
                "spartanfire:greatsword_desert",
                "spartanfire:greatsword_jungle",
                "spartanfire:greatsword_ice_dragonbone",
                "spartanfire:greatsword_fire_dragonbone",
                "spartanfire:greatsword_dragonbone",
                "spartanfire:warhammer_dragonbone",
                "spartanfire:hammer_dragonbone",
                "spartanfire:warhammer_fire_dragonbone",
                "spartanfire:hammer_fire_dragonbone",
                "spartanfire:warhammer_ice_dragonbone",
                "spartanfire:hammer_ice_dragonbone",
                "spartanfire:warhammer_jungle",
                "spartanfire:hammer_jungle",
                "spartanfire:warhammer_desert",
                "spartanfire:hammer_desert",
                "spartanfire:warhammer_jungle_venom",
                "spartanfire:hammer_jungle_venom",
                "spartanfire:warhammer_desert_venom",
                "spartanfire:warhammer_ice_dragonsteel",
                "spartanfire:hammer_desert_venom",
                "spartanfire:hammer_ice_dragonsteel",
                "spartanfire:hammer_fire_dragonsteel",
                "spartanfire:warhammer_fire_dragonsteel",
                "spartanweaponry:hammer_wood",
                "spartanweaponry:hammer_stone",
                "spartanweaponry:hammer_iron",
                "spartanweaponry:hammer_gold",
                "spartanweaponry:hammer_diamond",
                "spartanweaponry:warhammer_wood",
                "spartanweaponry:warhammer_stone",
                "spartanweaponry:warhammer_iron",
                "spartanweaponry:warhammer_gold",
                "spartanweaponry:warhammer_diamond",
                "spartanweaponry:hammer_copper",
                "spartanweaponry:warhammer_copper",
                "spartanweaponry:hammer_tin",
                "spartanweaponry:warhammer_tin",
                "spartanweaponry:hammer_bronze",
                "spartanweaponry:warhammer_bronze",
                "spartanweaponry:hammer_steel",
                "spartanweaponry:warhammer_steel",
                "spartanweaponry:hammer_silver",
                "spartanweaponry:warhammer_silver",
                "spartanweaponry:hammer_invar",
                "spartanweaponry:warhammer_invar",
                "spartanweaponry:hammer_platinum",
                "spartanweaponry:warhammer_platinum",
                "spartanweaponry:hammer_electrum",
                "spartanweaponry:warhammer_electrum",
                "spartanweaponry:hammer_nickel",
                "spartanweaponry:warhammer_nickel",
                "spartanweaponry:hammer_lead",
                "spartanweaponry:warhammer_lead",
                "spartanfire:spear_dragonbone",
                "spartanfire:spear_fire_dragonbone",
                "spartanfire:spear_ice_dragonbone",
                "spartanfire:spear_jungle",
                "spartanfire:spear_desert",
                "spartanfire:spear_jungle_venom",
                "spartanfire:spear_desert_venom",
                "spartanfire:spear_ice_dragonsteel",
                "spartanfire:spear_fire_dragonsteel",
                "spartanweaponry:spear_wood",
                "spartanweaponry:spear_stone",
                "spartanweaponry:spear_iron",
                "spartanweaponry:spear_gold",
                "spartanweaponry:spear_diamond",
                "spartanweaponry:spear_copper",
                "spartanweaponry:spear_tin",
                "spartanweaponry:spear_bronze",
                "spartanweaponry:spear_steel",
                "spartanweaponry:spear_silver",
                "spartanweaponry:spear_invar",
                "spartanweaponry:spear_platinum",
                "spartanweaponry:spear_electrum",
                "spartanweaponry:spear_nickel",
                "spartanweaponry:spear_lead",
                "spartanfire:halberd_dragonbone",
                "spartanfire:halberd_fire_dragonbone",
                "spartanfire:halberd_ice_dragonbone",
                "spartanfire:halberd_jungle",
                "spartanfire:halberd_desert",
                "spartanfire:halberd_jungle_venom",
                "spartanfire:halberd_desert_venom",
                "spartanfire:halberd_ice_dragonsteel",
                "spartanfire:halberd_fire_dragonsteel",
                "spartanweaponry:halberd_wood",
                "spartanweaponry:halberd_stone",
                "spartanweaponry:halberd_iron",
                "spartanweaponry:halberd_gold",
                "spartanweaponry:halberd_diamond",
                "spartanweaponry:halberd_copper",
                "spartanweaponry:halberd_tin",
                "spartanweaponry:halberd_bronze",
                "spartanweaponry:halberd_steel",
                "spartanweaponry:halberd_silver",
                "spartanweaponry:halberd_invar",
                "spartanweaponry:halberd_platinum",
                "spartanweaponry:halberd_electrum",
                "spartanweaponry:halberd_nickel",
                "spartanweaponry:halberd_lead",
                "spartanfire:pike_dragonbone",
                "spartanfire:pike_fire_dragonbone",
                "spartanfire:pike_ice_dragonbone",
                "spartanfire:pike_jungle",
                "spartanfire:pike_desert",
                "spartanfire:pike_jungle_venom",
                "spartanfire:pike_desert_venom",
                "spartanfire:pike_ice_dragonsteel",
                "spartanfire:pike_fire_dragonsteel",
                "spartanweaponry:pike_wood",
                "spartanweaponry:pike_stone",
                "spartanweaponry:pike_iron",
                "spartanweaponry:pike_gold",
                "spartanweaponry:pike_diamond",
                "spartanweaponry:pike_copper",
                "spartanweaponry:pike_tin",
                "spartanweaponry:pike_bronze",
                "spartanweaponry:pike_steel",
                "spartanweaponry:pike_silver",
                "spartanweaponry:pike_invar",
                "spartanweaponry:pike_platinum",
                "spartanweaponry:pike_electrum",
                "spartanweaponry:pike_nickel",
                "spartanweaponry:pike_lead",
                "spartanfire:lance_dragonbone",
                "spartanfire:lance_fire_dragonbone",
                "spartanfire:lance_ice_dragonbone",
                "spartanfire:lance_jungle",
                "spartanfire:lance_desert",
                "spartanfire:lance_jungle_venom",
                "spartanfire:lance_desert_venom",
                "spartanfire:lance_ice_dragonsteel",
                "spartanfire:lance_fire_dragonsteel",
                "spartanweaponry:lance_wood",
                "spartanweaponry:lance_stone",
                "spartanweaponry:lance_iron",
                "spartanweaponry:lance_gold",
                "spartanweaponry:lance_diamond",
                "spartanweaponry:lance_copper",
                "spartanweaponry:lance_tin",
                "spartanweaponry:lance_bronze",
                "spartanweaponry:lance_steel",
                "spartanweaponry:lance_silver",
                "spartanweaponry:lance_invar",
                "spartanweaponry:lance_platinum",
                "spartanweaponry:lance_electrum",
                "spartanweaponry:lance_nickel",
                "spartanweaponry:lance_lead",
                "spartanfire:longbow_dragonbone",
                "spartanfire:longbow_fire_dragonbone",
                "spartanfire:longbow_ice_dragonbone",
                "spartanfire:longbow_jungle",
                "spartanfire:longbow_desert",
                "spartanfire:longbow_jungle_venom",
                "spartanfire:longbow_desert_venom",
                "spartanfire:longbow_ice_dragonsteel",
                "spartanfire:longbow_fire_dragonsteel",
                "spartanweaponry:longbow_wood",
                "spartanweaponry:longbow_leather",
                "spartanweaponry:longbow_iron",
                "spartanweaponry:longbow_diamond",
                "spartanweaponry:longbow_copper",
                "spartanweaponry:longbow_tin",
                "spartanweaponry:longbow_bronze",
                "spartanweaponry:longbow_steel",
                "spartanweaponry:longbow_silver",
                "spartanweaponry:longbow_invar",
                "spartanweaponry:longbow_platinum",
                "spartanweaponry:longbow_electrum",
                "spartanweaponry:longbow_nickel",
                "spartanweaponry:longbow_lead",
                "spartanfire:crossbow_dragonbone",
                "spartanfire:crossbow_fire_dragonbone",
                "spartanfire:crossbow_ice_dragonbone",
                "spartanfire:crossbow_jungle",
                "spartanfire:crossbow_desert",
                "spartanfire:crossbow_jungle_venom",
                "spartanfire:crossbow_desert_venom",
                "spartanfire:crossbow_ice_dragonsteel",
                "spartanfire:crossbow_fire_dragonsteel",
                "spartanweaponry:crossbow_wood",
                "spartanweaponry:crossbow_leather",
                "spartanweaponry:crossbow_iron",
                "spartanweaponry:crossbow_diamond",
                "spartanweaponry:crossbow_copper",
                "spartanweaponry:crossbow_tin",
                "spartanweaponry:crossbow_bronze",
                "spartanweaponry:crossbow_steel",
                "spartanweaponry:crossbow_silver",
                "spartanweaponry:crossbow_invar",
                "spartanweaponry:crossbow_platinum",
                "spartanweaponry:crossbow_electrum",
                "spartanweaponry:crossbow_nickel",
                "spartanweaponry:crossbow_lead",
                "spartanfire:throwing_knife_dragonbone",
                "spartanfire:throwing_knife_fire_dragonbone",
                "spartanfire:throwing_knife_ice_dragonbone",
                "spartanfire:throwing_knife_jungle",
                "spartanfire:throwing_knife_desert",
                "spartanfire:throwing_knife_jungle_venom",
                "spartanfire:throwing_knife_desert_venom",
                "spartanfire:throwing_knife_ice_dragonsteel",
                "spartanfire:throwing_knife_fire_dragonsteel",
                "spartanweaponry:throwing_knife_wood",
                "spartanweaponry:throwing_knife_stone",
                "spartanweaponry:throwing_knife_iron",
                "spartanweaponry:throwing_knife_gold",
                "spartanweaponry:throwing_knife_diamond",
                "spartanweaponry:throwing_knife_copper",
                "spartanweaponry:throwing_knife_tin",
                "spartanweaponry:throwing_knife_bronze",
                "spartanweaponry:throwing_knife_steel",
                "spartanweaponry:throwing_knife_silver",
                "spartanweaponry:throwing_knife_invar",
                "spartanweaponry:throwing_knife_platinum",
                "spartanweaponry:throwing_knife_electrum",
                "spartanweaponry:throwing_knife_nickel",
                "spartanweaponry:throwing_knife_lead",
                "spartanfire:throwing_axe_dragonbone",
                "spartanfire:throwing_axe_fire_dragonbone",
                "spartanfire:throwing_axe_ice_dragonbone",
                "spartanfire:throwing_axe_jungle",
                "spartanfire:throwing_axe_desert",
                "spartanfire:throwing_axe_jungle_venom",
                "spartanfire:throwing_axe_desert_venom",
                "spartanfire:throwing_axe_ice_dragonsteel",
                "spartanfire:throwing_axe_fire_dragonsteel",
                "spartanweaponry:throwing_axe_wood",
                "spartanweaponry:throwing_axe_stone",
                "spartanweaponry:throwing_axe_iron",
                "spartanweaponry:throwing_axe_gold",
                "spartanweaponry:throwing_axe_diamond",
                "spartanweaponry:throwing_axe_copper",
                "spartanweaponry:throwing_axe_tin",
                "spartanweaponry:throwing_axe_bronze",
                "spartanweaponry:throwing_axe_steel",
                "spartanweaponry:throwing_axe_silver",
                "spartanweaponry:throwing_axe_invar",
                "spartanweaponry:throwing_axe_platinum",
                "spartanweaponry:throwing_axe_electrum",
                "spartanweaponry:throwing_axe_nickel",
                "spartanweaponry:throwing_axe_lead",
                "spartanfire:javelin_dragonbone",
                "spartanfire:javelin_fire_dragonbone",
                "spartanfire:javelin_ice_dragonbone",
                "spartanfire:javelin_jungle",
                "spartanfire:javelin_desert",
                "spartanfire:javelin_jungle_venom",
                "spartanfire:javelin_desert_venom",
                "spartanfire:javelin_ice_dragonsteel",
                "spartanfire:javelin_fire_dragonsteel",
                "spartanweaponry:javelin_wood",
                "spartanweaponry:javelin_stone",
                "spartanweaponry:javelin_iron",
                "spartanweaponry:javelin_gold",
                "spartanweaponry:javelin_diamond",
                "spartanweaponry:javelin_copper",
                "spartanweaponry:javelin_tin",
                "spartanweaponry:javelin_bronze",
                "spartanweaponry:javelin_steel",
                "spartanweaponry:javelin_silver",
                "spartanweaponry:javelin_invar",
                "spartanweaponry:javelin_platinum",
                "spartanweaponry:javelin_electrum",
                "spartanweaponry:javelin_nickel",
                "spartanweaponry:javelin_lead",
                "spartanfire:boomerang_dragonbone",
                "spartanfire:boomerang_fire_dragonbone",
                "spartanfire:boomerang_ice_dragonbone",
                "spartanfire:boomerang_jungle",
                "spartanfire:boomerang_desert",
                "spartanfire:boomerang_jungle_venom",
                "spartanfire:boomerang_desert_venom",
                "spartanfire:boomerang_ice_dragonsteel",
                "spartanfire:boomerang_fire_dragonsteel",
                "spartanweaponry:boomerang_wood",
                "spartanweaponry:boomerang_stone",
                "spartanweaponry:boomerang_iron",
                "spartanweaponry:boomerang_gold",
                "spartanweaponry:boomerang_diamond",
                "spartanweaponry:boomerang_copper",
                "spartanweaponry:boomerang_tin",
                "spartanweaponry:boomerang_bronze",
                "spartanweaponry:boomerang_steel",
                "spartanweaponry:boomerang_silver",
                "spartanweaponry:boomerang_invar",
                "spartanweaponry:boomerang_platinum",
                "spartanweaponry:boomerang_electrum",
                "spartanweaponry:boomerang_nickel",
                "spartanweaponry:boomerang_lead",
                "spartanfire:battleaxe_dragonbone",
                "spartanfire:battleaxe_fire_dragonbone",
                "spartanfire:battleaxe_ice_dragonbone",
                "spartanfire:battleaxe_jungle",
                "spartanfire:battleaxe_desert",
                "spartanfire:battleaxe_jungle_venom",
                "spartanfire:battleaxe_desert_venom",
                "spartanfire:battleaxe_ice_dragonsteel",
                "spartanfire:battleaxe_fire_dragonsteel",
                "spartanweaponry:battleaxe_wood",
                "spartanweaponry:battleaxe_stone",
                "spartanweaponry:battleaxe_iron",
                "spartanweaponry:battleaxe_gold",
                "spartanweaponry:battleaxe_diamond",
                "spartanweaponry:battleaxe_copper",
                "spartanweaponry:battleaxe_tin",
                "spartanweaponry:battleaxe_bronze",
                "spartanweaponry:battleaxe_steel",
                "spartanweaponry:battleaxe_silver",
                "spartanweaponry:battleaxe_invar",
                "spartanweaponry:battleaxe_platinum",
                "spartanweaponry:battleaxe_electrum",
                "spartanweaponry:battleaxe_nickel",
                "spartanweaponry:battleaxe_lead",
                "spartanfire:mace_dragonbone",
                "spartanfire:mace_fire_dragonbone",
                "spartanfire:mace_ice_dragonbone",
                "spartanfire:mace_jungle",
                "spartanfire:mace_desert",
                "spartanfire:mace_jungle_venom",
                "spartanfire:mace_desert_venom",
                "spartanfire:mace_ice_dragonsteel",
                "spartanfire:mace_fire_dragonsteel",
                "spartanweaponry:mace_wood",
                "spartanweaponry:mace_stone",
                "spartanweaponry:mace_iron",
                "spartanweaponry:mace_gold",
                "spartanweaponry:mace_diamond",
                "spartanweaponry:mace_copper",
                "spartanweaponry:mace_tin",
                "spartanweaponry:mace_bronze",
                "spartanweaponry:mace_steel",
                "spartanweaponry:mace_silver",
                "spartanweaponry:mace_invar",
                "spartanweaponry:mace_platinum",
                "spartanweaponry:mace_electrum",
                "spartanweaponry:mace_nickel",
                "spartanweaponry:mace_lead",
                "spartanfire:glaive_dragonbone",
                "spartanfire:glaive_fire_dragonbone",
                "spartanfire:glaive_ice_dragonbone",
                "spartanfire:glaive_desert",
                "spartanfire:glaive_jungle",
                "spartanfire:glaive_jungle_venom",
                "spartanfire:glaive_desert_venom",
                "spartanfire:glaive_ice_dragonsteel",
                "spartanfire:glaive_fire_dragonsteel",
                "spartanweaponry:glaive_wood",
                "spartanweaponry:glaive_stone",
                "spartanweaponry:glaive_iron",
                "spartanweaponry:glaive_gold",
                "spartanweaponry:glaive_diamond",
                "spartanweaponry:glaive_copper",
                "spartanweaponry:glaive_tin",
                "spartanweaponry:glaive_bronze",
                "spartanweaponry:glaive_steel",
                "spartanweaponry:glaive_silver",
                "spartanweaponry:glaive_invar",
                "spartanweaponry:glaive_platinum",
                "spartanweaponry:glaive_electrum",
                "spartanweaponry:glaive_nickel",
                "spartanweaponry:glaive_lead",
                "spartanfire:staff_dragonbone",
                "spartanfire:staff_fire_dragonbone",
                "spartanfire:staff_ice_dragonbone",
                "spartanfire:staff_jungle",
                "spartanfire:staff_desert",
                "spartanfire:staff_jungle_venom",
                "spartanfire:staff_desert_venom",
                "spartanfire:staff_ice_dragonsteel",
                "spartanfire:staff_fire_dragonsteel",
                "spartanweaponry:staff",
                "spartanweaponry:staff_stone",
                "spartanweaponry:staff_iron",
                "spartanweaponry:staff_gold",
                "spartanweaponry:staff_diamond",
                "spartanweaponry:staff_copper",
                "spartanweaponry:staff_tin",
                "spartanweaponry:staff_bronze",
                "spartanweaponry:staff_steel",
                "spartanweaponry:staff_silver",
                "spartanweaponry:staff_invar",
                "spartanweaponry:staff_platinum",
                "spartanweaponry:staff_electrum",
                "spartanweaponry:staff_nickel",
                "spartanweaponry:staff_lead"
        };

        String[] weaponToolTypes = {
            "Dagger",
            "Longsword",
            "Katana",
            "Saber",
            "Rapier",
            "Greatsword",
            "Hammer",
            "Warhammer",
            "Spear",
            "Halberd",
            "Pike",
            "Lance",
            "Longbow",
            "Crossbow",
            "Throwing Knife",
            "Throwing Axe",
            "Javelin",
            "Glaive",
            "Quarterstaff"
        };

        String[] materialList = {
            "Wood",
            "Stone",
            "Iron",
            "Gold",
            "Diamond",
            "Copper",
            "Tin",
            "Bronze",
            "Steel",
            "Silver",
            "Invar",
            "Platinum",
            "Electrum",
            "Nickel",
            "Lead",
            "Fire Dragonsteel",
            "Ice Dragonsteel",
            "Desert Myrmex",
            "Jungle Myrmex",
            "Desert Myrmex Stinger",
            "Jungle Myrmex Stinger",
            "Ice Dragonbone",
            "Fire Dragonbone",
            "Dragonbone"
        };

        for (int i = 0; i < weaponlist.length; i++) {
            char semicolumn = ':';
            char underscore = '_';
            char nothing = '\0';
            String proWeaponList = weaponlist[i].replace(semicolumn, nothing).replace(underscore, nothing).toUpperCase();

            for (int m = 0; m < materialList.length ; m++) {
                for (int w = 0; w < weaponToolTypes.length; w++) {
                    System.out.println(proWeaponList + "FIERY, " + weaponlist[i] + " > display:Name = \"Fiery Oil Coated " + materialList[m] + " " + weaponToolTypes[w] + "\"");
                    System.out.println(proWeaponList + "FROST, " + weaponlist[i] + " > display:Name = \"Frost Oil Coated " + materialList[m] + " " + weaponToolTypes[w] + "\"");
                    System.out.println(proWeaponList + "TERRA, " + weaponlist[i] + " > display:Name = \"Terra Oil Coated " + materialList[m] + " " + weaponToolTypes[w] + "\"");
                    System.out.println(proWeaponList + "ZEPHYR, " + weaponlist[i] + " > display:Name = \"Zephyr Oil Coated " + materialList[m] + " " + weaponToolTypes[w] + "\"");
                }
            }
        }
    }
}