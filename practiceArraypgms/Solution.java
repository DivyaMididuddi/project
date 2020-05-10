package practiceArraypgms;

public class Solution 
{
	public static void main(String[] args) 
	{
		Document d[]=new Document[4];
		d[0]=new Document(1,"folder1","title1",10);
		d[1]=new Document(2,"folder2","title2",20);
		d[2]=new Document(3,"folder3","title3",30);
		d[3]=new Document(4,"folder4","title4",40);
	    // =combinedDocumentsmethod(d[] );
		
	}
	public static Document combinedDocumentsmethod(Document d1[])
	{
		Document d2=new Document(0, null, null, 0);
		int finalid=d1[0].getId();
		for(int i=0;i<=d1.length-1;i++)
		{
			int tempid=d1[i].getId();
			if(finalid<tempid)
			{
				int tempf=finalid;
				finalid=tempid;
				tempid=finalid;
				
			}
		}
		d2.setId(finalid);
		String finalfoldername="";
		for(int j=0;j<=d1.length-1;j++)
		{
			finalfoldername=finalfoldername+d1[j].getFolderName()+'#';
		}
		d2.setFolderName(finalfoldername);
		String finaltitle="";
		for(int k=0;k<=d1.length-1;k++)
		{
			finaltitle=finaltitle+d1[k].getTitle();
		}
		d2.setTitle(finaltitle);
		int finalpages=0;
		for(int l=0;l<=d1.length-1;l++)
		{
			int num=d1[l].getPages();
			{
				finalpages=finalpages+num;
			}
		}
		d2.setPages(finalpages);
		
		
	return d2;	
		
	}

}
