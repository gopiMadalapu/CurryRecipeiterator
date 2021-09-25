
public class RecipeCollectionImpl implements RecipeCollection 
{
	public String recipe[]= {"Recipe Types: Pasta & risotto, Bread & doughs, Soup, Roast etc..",
			"Continental Dishes: Sweet Potato pie, Crispy Calamari Rings,Yorkshire Lamb Patties etc..",
			"Cost: $5 to $100"};

	@Override
	public Iterator getIterator() 
	{
		return new RecipeIteratorImpl();
	}
	
	private class RecipeIteratorImpl implements Iterator
	{
		int startIndex=0;
		@Override
		public boolean hasNext()
		{
			if(startIndex<recipe.length)
				 return true;
			else
				return false;
		}

		@Override
		public Object next()
		{
			if(hasNext())
				return recipe[startIndex++];
			else
				return null;
		}
		
	}
}
