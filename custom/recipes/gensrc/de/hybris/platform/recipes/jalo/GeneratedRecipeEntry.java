/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2-mag-2017 18.02.04                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.recipes.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.recipes.constants.RecipesConstants;
import de.hybris.platform.recipes.jalo.Food;
import de.hybris.platform.recipes.jalo.Recipe;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem RecipeEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRecipeEntry extends GenericItem
{
	/** Qualifier of the <code>RecipeEntry.prodotto</code> attribute **/
	public static final String PRODOTTO = "prodotto";
	/** Qualifier of the <code>RecipeEntry.quantita</code> attribute **/
	public static final String QUANTITA = "quantita";
	/** Qualifier of the <code>RecipeEntry.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>RecipeEntry.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>RecipeEntry.Recipe</code> attribute **/
	public static final String RECIPE = "Recipe";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RECIPE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRecipeEntry> RECIPEHANDLER = new BidirectionalOneToManyHandler<GeneratedRecipeEntry>(
	RecipesConstants.TC.RECIPEENTRY,
	false,
	"Recipe",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODOTTO, AttributeMode.INITIAL);
		tmp.put(QUANTITA, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(RECIPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RECIPEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipeEntry.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipeEntry.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.prodotto</code> attribute.
	 * @return the prodotto
	 */
	public Food getProdotto(final SessionContext ctx)
	{
		return (Food)getProperty( ctx, PRODOTTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.prodotto</code> attribute.
	 * @return the prodotto
	 */
	public Food getProdotto()
	{
		return getProdotto( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.prodotto</code> attribute. 
	 * @param value the prodotto
	 */
	public void setProdotto(final SessionContext ctx, final Food value)
	{
		setProperty(ctx, PRODOTTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.prodotto</code> attribute. 
	 * @param value the prodotto
	 */
	public void setProdotto(final Food value)
	{
		setProdotto( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantita</code> attribute.
	 * @return the quantita
	 */
	public Integer getQuantita(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, QUANTITA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantita</code> attribute.
	 * @return the quantita
	 */
	public Integer getQuantita()
	{
		return getQuantita( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @return the quantita
	 */
	public int getQuantitaAsPrimitive(final SessionContext ctx)
	{
		Integer value = getQuantita( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @return the quantita
	 */
	public int getQuantitaAsPrimitive()
	{
		return getQuantitaAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @param value the quantita
	 */
	public void setQuantita(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, QUANTITA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @param value the quantita
	 */
	public void setQuantita(final Integer value)
	{
		setQuantita( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @param value the quantita
	 */
	public void setQuantita(final SessionContext ctx, final int value)
	{
		setQuantita( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @param value the quantita
	 */
	public void setQuantita(final int value)
	{
		setQuantita( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.Recipe</code> attribute.
	 * @return the Recipe
	 */
	public Recipe getRecipe(final SessionContext ctx)
	{
		return (Recipe)getProperty( ctx, RECIPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.Recipe</code> attribute.
	 * @return the Recipe
	 */
	public Recipe getRecipe()
	{
		return getRecipe( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.Recipe</code> attribute. 
	 * @param value the Recipe
	 */
	public void setRecipe(final SessionContext ctx, final Recipe value)
	{
		RECIPEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.Recipe</code> attribute. 
	 * @param value the Recipe
	 */
	public void setRecipe(final Recipe value)
	{
		setRecipe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.unit</code> attribute.
	 * @return the unit
	 */
	public Unit getUnit(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.unit</code> attribute.
	 * @return the unit
	 */
	public Unit getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final Unit value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
}
