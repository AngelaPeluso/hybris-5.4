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
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.recipes.constants.RecipesConstants;
import de.hybris.platform.recipes.jalo.RecipeEntry;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Recipe}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRecipe extends GenericItem
{
	/** Qualifier of the <code>Recipe.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Recipe.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Recipe.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Recipe.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>Recipe.difficult</code> attribute **/
	public static final String DIFFICULT = "difficult";
	/** Qualifier of the <code>Recipe.people</code> attribute **/
	public static final String PEOPLE = "people";
	/** Qualifier of the <code>Recipe.RecipeEntry</code> attribute **/
	public static final String RECIPEENTRY = "RecipeEntry";
	/**
	* {@link OneToManyHandler} for handling 1:n RECIPEENTRY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RecipeEntry> RECIPEENTRYHANDLER = new OneToManyHandler<RecipeEntry>(
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
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		tmp.put(DIFFICULT, AttributeMode.INITIAL);
		tmp.put(PEOPLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.difficult</code> attribute.
	 * @return the difficult
	 */
	public EnumerationValue getDifficult(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DIFFICULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.difficult</code> attribute.
	 * @return the difficult
	 */
	public EnumerationValue getDifficult()
	{
		return getDifficult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.difficult</code> attribute. 
	 * @param value the difficult
	 */
	public void setDifficult(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DIFFICULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.difficult</code> attribute. 
	 * @param value the difficult
	 */
	public void setDifficult(final EnumerationValue value)
	{
		setDifficult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.people</code> attribute.
	 * @return the people
	 */
	public Integer getPeople(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PEOPLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.people</code> attribute.
	 * @return the people
	 */
	public Integer getPeople()
	{
		return getPeople( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.people</code> attribute. 
	 * @return the people
	 */
	public int getPeopleAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPeople( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.people</code> attribute. 
	 * @return the people
	 */
	public int getPeopleAsPrimitive()
	{
		return getPeopleAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.people</code> attribute. 
	 * @param value the people
	 */
	public void setPeople(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PEOPLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.people</code> attribute. 
	 * @param value the people
	 */
	public void setPeople(final Integer value)
	{
		setPeople( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.people</code> attribute. 
	 * @param value the people
	 */
	public void setPeople(final SessionContext ctx, final int value)
	{
		setPeople( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.people</code> attribute. 
	 * @param value the people
	 */
	public void setPeople(final int value)
	{
		setPeople( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.RecipeEntry</code> attribute.
	 * @return the RecipeEntry
	 */
	public Collection<RecipeEntry> getRecipeEntry(final SessionContext ctx)
	{
		return RECIPEENTRYHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.RecipeEntry</code> attribute.
	 * @return the RecipeEntry
	 */
	public Collection<RecipeEntry> getRecipeEntry()
	{
		return getRecipeEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.RecipeEntry</code> attribute. 
	 * @param value the RecipeEntry
	 */
	public void setRecipeEntry(final SessionContext ctx, final Collection<RecipeEntry> value)
	{
		RECIPEENTRYHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.RecipeEntry</code> attribute. 
	 * @param value the RecipeEntry
	 */
	public void setRecipeEntry(final Collection<RecipeEntry> value)
	{
		setRecipeEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to RecipeEntry. 
	 * @param value the item to add to RecipeEntry
	 */
	public void addToRecipeEntry(final SessionContext ctx, final RecipeEntry value)
	{
		RECIPEENTRYHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to RecipeEntry. 
	 * @param value the item to add to RecipeEntry
	 */
	public void addToRecipeEntry(final RecipeEntry value)
	{
		addToRecipeEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from RecipeEntry. 
	 * @param value the item to remove from RecipeEntry
	 */
	public void removeFromRecipeEntry(final SessionContext ctx, final RecipeEntry value)
	{
		RECIPEENTRYHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from RecipeEntry. 
	 * @param value the item to remove from RecipeEntry
	 */
	public void removeFromRecipeEntry(final RecipeEntry value)
	{
		removeFromRecipeEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.time</code> attribute.
	 * @return the time
	 */
	public Integer getTime(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.time</code> attribute.
	 * @return the time
	 */
	public Integer getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.time</code> attribute. 
	 * @return the time
	 */
	public int getTimeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTime( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.time</code> attribute. 
	 * @return the time
	 */
	public int getTimeAsPrimitive()
	{
		return getTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final Integer value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final SessionContext ctx, final int value)
	{
		setTime( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final int value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
}
