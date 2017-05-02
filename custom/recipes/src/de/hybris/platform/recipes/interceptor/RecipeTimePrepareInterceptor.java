/**
 *
 */
package de.hybris.platform.recipes.interceptor;

import de.hybris.platform.recipes.model.RecipeModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;


/**
 *
 */
public class RecipeTimePrepareInterceptor implements LoadInterceptor<RecipeModel>
{
	public void onLoad(final RecipeModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		int newTime = arg0.getTime().intValue();
		newTime = newTime + 10;
		arg0.setTime(Integer.valueOf(newTime));
	}
}
