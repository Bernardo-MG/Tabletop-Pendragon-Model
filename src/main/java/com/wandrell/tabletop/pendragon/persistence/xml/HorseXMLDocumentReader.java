package com.wandrell.tabletop.pendragon.persistence.xml;

import java.util.LinkedList;

import org.jdom2.Document;
import org.jdom2.Element;

import com.wandrell.tabletop.pendragon.character.DefaultHorseCharacter;
import com.wandrell.tabletop.pendragon.character.HorseCharacter;
import com.wandrell.tabletop.pendragon.conf.FileLabels;
import com.wandrell.tabletop.pendragon.valuehandler.PendragonAttribute;
import com.wandrell.tabletop.util.XMLUtils;
import com.wandrell.util.file.api.xml.XMLDocumentReader;

public class HorseXMLDocumentReader implements
	XMLDocumentReader<HorseCharacter> {

    public HorseXMLDocumentReader() {
	super();
    }

    @SuppressWarnings("unused")
    @Override
    public final HorseCharacter getValue(final Document doc) {
	final DefaultHorseCharacter holder;
	final Element secAttributes, flags;
	final Element root;

	root = doc.getRootElement();

	holder = new DefaultHorseCharacter(new LinkedList<PendragonAttribute>());

	// TODO
	// PersistenceFactory.getCharacterService().addToBaseCharacter(root,
	// holder);

	// Acquires the different sections
	secAttributes = root.getChild(FileLabels.SECONDARY_ATTRIBUTES);
	flags = root.getChild(FileLabels.FLAGS);

	// Horse race
	holder.setHorseType(root.getChildText(FileLabels.RACE));

	// Secondary attributes
	// TODO
	// holder.setSecondaryAttributes(XMLUtils.readIntegerValueHandlerXMLTree(
	// secAttributes, new IntegerValueHandler()));

	// Flags
	holder.setFlags(XMLUtils.readBooleanXMLTree(flags));

	return holder;
    }

}