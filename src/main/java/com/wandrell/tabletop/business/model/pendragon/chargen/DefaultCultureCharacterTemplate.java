package com.wandrell.tabletop.business.model.pendragon.chargen;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collections;
import java.util.Map;

import com.wandrell.tabletop.business.model.skill.NameAndDescriptor;

public final class DefaultCultureCharacterTemplate implements
        CultureCharacterTemplate {

    private final Map<String, Integer>            attributes;
    private final Map<NameAndDescriptor, Integer> directedTraits;
    private final Map<NameAndDescriptor, Integer> passions;
    private final Map<NameAndDescriptor, Integer> skills;
    private final Map<String, Integer>            specialtySkills;
    private final Map<String, Integer>            traits;

    public DefaultCultureCharacterTemplate(
            final Map<String, Integer> attributes,
            final Map<NameAndDescriptor, Integer> skills,
            final Map<String, Integer> specialtySkills,
            final Map<String, Integer> traits,
            final Map<NameAndDescriptor, Integer> directedTraits,
            final Map<NameAndDescriptor, Integer> passions) {
        super();

        checkNotNull(attributes, "Received a null pointer as attributes");
        checkNotNull(skills, "Received a null pointer as skills");
        checkNotNull(specialtySkills,
                "Received a null pointer as specialty skills");
        checkNotNull(traits, "Received a null pointer as traits");
        checkNotNull(directedTraits,
                "Received a null pointer as directed traits");
        checkNotNull(passions, "Received a null pointer as passions");

        this.attributes = attributes;
        this.skills = skills;
        this.specialtySkills = specialtySkills;
        this.traits = traits;
        this.directedTraits = directedTraits;
        this.passions = passions;
    }

    @Override
    public final Map<String, Integer> getAttributes() {
        return Collections.unmodifiableMap(getAttributesModifiable());
    }

    @Override
    public final Map<NameAndDescriptor, Integer> getDirectedTraits() {
        return Collections.unmodifiableMap(getDirectedTraitsModifiable());
    }

    @Override
    public final Map<NameAndDescriptor, Integer> getPassions() {
        return Collections.unmodifiableMap(getPassionsModifiable());
    }

    @Override
    public final Map<NameAndDescriptor, Integer> getSkills() {
        return Collections.unmodifiableMap(getSkillsModifiable());
    }

    @Override
    public final Map<String, Integer> getSpecialtySkills() {
        return Collections.unmodifiableMap(getSpecialtySkillsModifiable());
    }

    @Override
    public final Map<String, Integer> getTraits() {
        return Collections.unmodifiableMap(getTraitsModifiable());
    }

    private final Map<String, Integer> getAttributesModifiable() {
        return attributes;
    }

    private final Map<NameAndDescriptor, Integer> getDirectedTraitsModifiable() {
        return directedTraits;
    }

    private final Map<NameAndDescriptor, Integer> getPassionsModifiable() {
        return passions;
    }

    private final Map<NameAndDescriptor, Integer> getSkillsModifiable() {
        return skills;
    }

    private final Map<String, Integer> getSpecialtySkillsModifiable() {
        return specialtySkills;
    }

    private final Map<String, Integer> getTraitsModifiable() {
        return traits;
    }

}
