/*
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
 *
 */
package de.hybris.platform.recipes.jobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.recipes.model.MenuModel;
import de.hybris.platform.recipes.model.RecipeModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;


public class RecipeServiceJob extends AbstractJobPerformable<CronJobModel>
{
	//private static final Logger LOG = Logger.getLogger(RecipeServiceJob.class);

	@Override
	public PerformResult perform(final CronJobModel arg0)
	{
		final String sql = "select(pk)from (Recipe)";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(sql);
		final SearchResult<RecipeModel> result = (SearchResult<RecipeModel>) flexibleSearchService.search(query);
		final List<RecipeModel> recipesList = result.getResult();
		if (recipesList.isEmpty())
		{
			return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
		}
		final MenuModel menu = modelService.create(MenuModel.class);
		menu.setCode("01234");
		menu.setName("Menu del giorno");
		menu.setRecipes(recipesList);
		modelService.save(menu);
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

	}

}