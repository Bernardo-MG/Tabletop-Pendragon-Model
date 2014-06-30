package com.wandrell.tabletop.rpg.pendragon.persistence.xml.inventory;

import org.jdom2.Document;
import org.jdom2.Element;

import com.wandrell.tabletop.rpg.pendragon.conf.FileLabels;
import com.wandrell.tabletop.rpg.pendragon.inventory.PendragonEquipment;
import com.wandrell.util.file.api.xml.XMLDocumentReader;

public abstract class AbstractEquipableItemXMLDocumentReader<V extends PendragonEquipment>
	implements XMLDocumentReader<V> {

    public AbstractEquipableItemXMLDocumentReader() {
	super();
    }

    @SuppressWarnings("unchecked")
    @Override
    public V getValue(final Document doc) {
	final Element values, flags, bonus;
	PendragonEquipment holder = null;
	final Element root = doc.getRootElement();

	// TODO
	// holder = (PendragonEquipment) PersistenceFactory.getItemService()
	// .readItemXMLNode(root,
	// ClassInstanceFactory.getNewValue(classValue));

	// Acquires the different sections
	values = root.getChild(FileLabels.VALUE_HANDLERS);
	flags = root.getChild(FileLabels.FLAGS);
	bonus = root.getChild(FileLabels.TEMPLATE_BONUS);

	// Values
	if (values != null) {
	    // TODO
	    // holder.setValues(XMLUtils.readIntegerValueHandlerXMLTree(values,
	    // new IntegerValueHandler()));
	}

	// Flags
	if (flags != null) {
	    // TODO
	    // holder.setFlags(XMLUtils.readBooleanXMLTree(flags));
	}

	// Bonus
	if (bonus != null) {
	    // TODO
	    // holder.setBonusValuesTemplate(PersistenceFactory
	    // .getPendragonTemplateService()
	    // .readPendragonTemplateXMLTree(bonus,
	    // new DefaultPendragonTemplate()));
	}

	return (V) holder;
    }

}
