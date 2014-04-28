package com.wandrell.tabletop.rpg.pendragon.persistence.xml.inventory;

import org.jdom2.Document;
import org.jdom2.Element;

import com.wandrell.tabletop.rpg.pendragon.conf.FileLabels;
import com.wandrell.tabletop.rpg.pendragon.inventory.PendragonEquipment;
import com.wandrell.util.file.api.xml.XMLDocumentWriter;

public class EquipableItemXMLDocumentBuilder implements
	XMLDocumentWriter<PendragonEquipment> {

    @Override
    public Document getDocument(final PendragonEquipment holder) {
	final Document doc;
	Element node;

	// TODO
	doc = null;
	// doc = new Document(PersistenceFactory.getItemService()
	// .buildItemXMLNode(holder));

	// Removes quantity count
	doc.getRootElement().removeChild(FileLabels.QUANTITY);

	// Removes money value count
	doc.getRootElement().removeChild(FileLabels.MONEY);

	// Values
	node = null;
	// TODO
	// node = XMLUtils.buildIntegerValueHandlerXMLTree(new Element(
	// FileLabels.VALUE_HANDLERS), holder.getValuesIterator(),
	// FileLabels.VALUE_HANDLER);
	if (node.getChildren().size() > 0) {
	    doc.getRootElement().addContent(node);
	}

	// Flags
	// TODO
	// node = XMLUtils.buildBooleansSetXMLTree(new
	// Element(FileLabels.FLAGS),
	// holder.getFlagsIterator());
	// if (node.getChildren().size() > 0) {
	// doc.getRootElement().addContent(node);
	// }

	// Bonus
	// TODO
	// node = PersistenceFactory.getPendragonTemplateService()
	// .buildPendragonTemplateXMLNode(holder.getBonusValuesTemplate(),
	// new Element(FileLabels.TEMPLATE_BONUS));
	if (node.getChildren().size() > 0) {
	    doc.getRootElement().addContent(node);
	}

	return doc;
    }

}
