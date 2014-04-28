package com.wandrell.tabletop.rpg.pendragon.persistence.xml.background;

import org.jdom2.Document;
import org.jdom2.Element;

import com.wandrell.tabletop.rpg.conf.FileStreamerTags;
import com.wandrell.tabletop.rpg.pendragon.character.background.Religion;
import com.wandrell.tabletop.rpg.pendragon.conf.FileLabels;
import com.wandrell.util.file.api.xml.XMLDocumentWriter;

public class ReligionTemplateXMLDocumentBuilder implements
	XMLDocumentWriter<Religion> {

    @Override
    public Document getDocument(final Religion holder) {
	final Document doc;
	Element node;

	// Root and religion name
	node = new Element(FileLabels.RELIGION);
	node.setAttribute(FileStreamerTags.NAME, holder.getName());
	doc = new Document(node);

	// Religious traits
	// TODO
	// doc.getRootElement().addContent(
	// XMLUtils.buildStringListXMLTree(new Element(FileLabels.TRAITS),
	// holder.getReligiousTraits(), FileLabels.TRAIT));

	// Religious bonus
	// TODO
	// node = PersistenceFactory.getPendragonTemplateService()
	// .buildPendragonTemplateXMLNode(holder.getBonusTemplate(),
	// new Element(FileLabels.TEMPLATE_BONUS));
	if (node.getChildren().size() > 0) {
	    doc.getRootElement().addContent(node);
	}

	return doc;
    }

}
