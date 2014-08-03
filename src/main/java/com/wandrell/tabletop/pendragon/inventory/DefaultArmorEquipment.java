package com.wandrell.tabletop.pendragon.inventory;

import java.util.Collection;
import java.util.Map;

public final class DefaultArmorEquipment implements ArmorEquipment {

    private final PendragonEquipment item;

    public DefaultArmorEquipment(final DefaultArmorEquipment armor) {
	super();

	item = armor.item;
    }

    public DefaultArmorEquipment(final PendragonEquipment item) {
	super();

	this.item = item;
    }

    @Override
    public final String getDescription() {
	return getBaseItem().getDescription();
    }

    @Override
    public final Boolean getFlag(final String name) {
	return getBaseItem().getFlag(name);
    }

    @Override
    public final Collection<String> getFlags() {
	return getBaseItem().getFlags();
    }

    @Override
    public final Map<String, Integer> getMiscelanyValues() {
	return getBaseItem().getMiscelanyValues();
    }

    @Override
    public final PendragonMoney getMoney() {
	return getBaseItem().getMoney();
    }

    @Override
    public final String getName() {
	return getBaseItem().getName();
    }

    @Override
    public final Boolean hasFlag(final String name) {
	return getBaseItem().hasFlag(name);
    }

    private final PendragonEquipment getBaseItem() {
	return item;
    }

}
