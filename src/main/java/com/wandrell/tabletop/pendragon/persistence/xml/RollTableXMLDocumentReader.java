package com.wandrell.tabletop.pendragon.persistence.xml;

import org.jdom2.Document;
import org.jdom2.Element;

import com.wandrell.tabletop.dice.DefaultRollTable;
import com.wandrell.tabletop.dice.RollTable;
import com.wandrell.tabletop.pendragon.conf.FileLabels;
import com.wandrell.util.file.api.xml.XMLDocumentReader;

public class RollTableXMLDocumentReader implements
	XMLDocumentReader<RollTable<String>> {

    public RollTableXMLDocumentReader() {
	super();
    }

    @Override
    public final RollTable<String> getValue(final Document doc) {
	final DefaultRollTable<String> holder;
	final Element intervals;
	final Element root;

	root = doc.getRootElement();

	holder = new DefaultRollTable<String>(null, null, null);

	// Acquires the different sections
	intervals = root.getChild(FileLabels.INTERVALS);

	// Table's name
	// TODO
	// holder.setName(root.getAttributeValue(FileStreamerTags.NAME));

	// Intervals and results
	readIntervalsXMLTree(intervals, holder);

	return holder;
    }

    @SuppressWarnings("unused")
    private final void readIntervalsXMLTree(final Element root,
	    final DefaultRollTable<String> holder) {
	for (final Element node : root.getChildren()) {
	    // TODO
	    // holder.put((ContrastInterval<Integer>) XMLUtils
	    // .readIntegerIntervalXMLNode(node), node
	    // .getChildText(FileStreamerTags.VALUE));
	}
    }

}