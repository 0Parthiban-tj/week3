package utility;

import model.Blog;



//class extends offensivewords and implements offensive wordinterface
public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface
{
	String a[]= {"ass","anal","anal impaler","anal leakage","analprobe","booger","bookie","boong","booobs","boooobs","c-0-c-k","c0cksucker","caca","cacafuego","cahone","camel toe","cameltoe","camgirl","camslut","camwhore","ass fuck"," ass hole","suckass","sucked","sucking","sucks","suicide girls","sultry women"};

	@Override
	public boolean checkBlogTitle(Blog blog) 
	{
		String title=blog.getBlogTitle();
		for(int i=0;i<25;i++)
		{
			if(title.equalsIgnoreCase(a[i]))
			{
				
				return true;
			}
		}
	
		return false;
	}

	@Override
	public boolean checkBlogDescription(Blog blog)
	{
		String description=blog.getBlogDescription();
		for(int i=0;i<25;i++)
			{
			if(description.equalsIgnoreCase(a[i]))
				return true;
		}
	     return false;
	}

	@Override
	
	public boolean checkBlog(Blog blog)
	{
		if((checkBlogTitle(blog))||(checkBlogDescription(blog)))
			return false;
		return true;
	}
	
}

