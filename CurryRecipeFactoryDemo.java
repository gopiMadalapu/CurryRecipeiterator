
public class CurryRecipeFactoryDemo 
{

	public static void main(String[] args)
	{
		RecipeCollectionImpl recipeFactory = new RecipeCollectionImpl();
		Iterator iterator = recipeFactory.getIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
