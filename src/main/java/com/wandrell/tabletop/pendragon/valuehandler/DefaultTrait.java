package com.wandrell.tabletop.pendragon.valuehandler;

import com.wandrell.tabletop.valuehandler.DefaultValueHandler;
import com.wandrell.tabletop.valuehandler.DelegateValueHandler;
import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.tabletop.valuehandler.module.GeneratorModule;
import com.wandrell.tabletop.valuehandler.module.IntervalModule;
import com.wandrell.tabletop.valuehandler.module.StoreModule;
import com.wandrell.tabletop.valuehandler.module.ValidatorModule;

public final class DefaultTrait implements Trait {

    private final DelegateValueHandler composite;
    private final boolean              goodTrait;
    private Trait                      traitMirror;

    public DefaultTrait(final DefaultTrait vh) {
        super();
        composite = vh.composite.createNewInstance();

        goodTrait = vh.goodTrait;
    }

    public DefaultTrait(final String name, final GeneratorModule generator,
            final IntervalModule interval, final StoreModule store,
            final ValidatorModule validator, final boolean goodTrait) {
        super();

        composite = new DefaultValueHandler(name, generator, interval, store,
                validator);

        this.goodTrait = goodTrait;
    }

    @Override
    public final Boolean acceptsValue(final Integer value) {
        return getValueHandler().acceptsValue(value);
    }

    @Override
    public final void addValue(final Integer value) {
        getValueHandler().addValue(value);
    }

    @Override
    public final DefaultTrait createNewInstance() {
        return new DefaultTrait(this);
    }

    @Override
    public final void decreaseValue() {
        getValueHandler().decreaseValue();
    }

    @Override
    public final Integer getLowerLimit() {
        return getValueHandler().getLowerLimit();
    }

    @Override
    public final Trait getMirrorTrait() {
        return traitMirror;
    }

    @Override
    public final String getName() {
        return getValueHandler().getName();
    }

    @Override
    public final Integer getStoredValue() {
        return getValueHandler().getStoredValue();
    }

    @Override
    public final Integer getUpperLimit() {
        return getValueHandler().getUpperLimit();
    }

    @Override
    public final void increaseValue() {
        getValueHandler().increaseValue();
    }

    @Override
    public final Boolean isAbleToDecrease() {
        return getValueHandler().isAbleToDecrease();
    }

    @Override
    public final Boolean isAbleToIncrease() {
        return getValueHandler().isAbleToIncrease();
    }

    @Override
    public final Boolean isGoodTrait() {
        return goodTrait;
    }

    public final void setMirrorTrait(final Trait trait) {
        traitMirror = trait;
    }

    @Override
    public final void setValue(final Integer value) {
        getValueHandler().setValue(value);
    }

    @Override
    public final String toString() {
        return getName();
    }

    protected final ValueHandler getValueHandler() {
        return composite;
    }

}