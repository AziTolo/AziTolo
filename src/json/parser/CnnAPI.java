package json.parser;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=5b8eb35377804c708368fcc320428d17

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      {
	"status": "ok",
	"totalResults": 10,
	"articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Ray Sanchez, CNN",
		"title": "Here's what we know about the Boulder, Colorado, mass shooting suspect",
		"description": "Ahmad Al Aliwi Alissa was identified by authorities Tuesday as the gunman who opened fire at a King Soopers grocery store in Colorado, killing 10 people, including a Boulder police officer.",
		"url": "http://us.cnn.com/2021/03/23/us/boulder-colorado-shooting-suspect/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/210323114942-ahmad-al-aliwi-alissa-super-tease.jpg",
		"publishedAt": "2021-03-23T16:16:55Z",
		"content": "(CNN)Ahmad Al Aliwi Alissa was identified by authorities Tuesday as the gunman who opened fire at a King Soopers grocery store in Colorado, killing 10 people, including a Boulder police officer. \r\nTh… [+1753 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Opinion by Po Murray",
		"title": "Opinion: What has to happen after the Colorado killings",
		"description": "Po Murray writes that the two mass killings in the past week have demonstrated forcefully that Democrats have to force gun control legislation through the Senate in spite of the filibuster.",
		"url": "http://us.cnn.com/2021/03/23/opinions/colorado-killings-gun-control-filibuster-opinion-murray/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/210322204514-11b-boulder-reported-shooting-0322-super-tease.jpg",
		"publishedAt": "2021-03-23T14:58:11Z",
		"content": "Po Murray is the Chairwoman of Newtown Action Alliance, a Newtown-based national grassroots gun violence prevention organization established after the Sandy Hook shooting tragedy. The views expressed… [+5143 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "McCabe: 'Absolutely nothing' will keep this from happening again - CNN Video",
		"description": "Former FBI Deputy Director Andrew McCabe reacts after a shooting at a Boulder, Colorado, grocery store left 10 people dead.",
		"url": "http://us.cnn.com/videos/us/2021/03/23/andrew-mccabe-boulder-colorado-shooting-newday-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/210323075953-andrew-mccabe-new-day-3-23-2021-super-tease.jpg",
		"publishedAt": "2021-03-23T12:22:38.9593459Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Katelyn Polantz, CNN",
		"title": "Sidney Powell argues in new court filing that no reasonable people would believe her election fraud claims",
		"description": "Right-wing lawyer Sidney Powell is claiming in a new court filing that reasonable people wouldn't have believed as fact her assertions of fraud after the 2020 presidential election.",
		"url": "http://us.cnn.com/2021/03/22/politics/sidney-powell-dominion-lawsuit-election-fraud/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/201123162610-sidney-powell-1119-super-tease.jpg",
		"publishedAt": "2021-03-23T12:15:46Z",
		"content": "Washington (CNN)Right-wing lawyer Sidney Powell is claiming in a new court filing that reasonable people wouldn't have believed as fact her assertions of fraud after the 2020 presidential election.\r\n… [+3854 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "By Melissa Macaya, Mike Hayes, <a href=\"/profiles/meg-wagner\">Meg Wagner</a>, <a href=\"/profiles/melissa-mahtani\" target=\"_blank\">Melissa Mahtani </a>and <a href=\"/profiles/veronica-rocha\" target=\"_blank\">Veronica Rocha</a> CNN",
		"title": "Shooting in Boulder, Colorado: Live updates",
		"description": "Ten people, including a police officer, were killed Monday after a gunman opened fire in a grocery store in Boulder, Colorado. Follow here for the latest.",
		"url": "https://www.cnn.com/us/live-news/boulder-colorado-shooting-3-23-21/h_d2c6bfa72c6c13c313a908471e482598",
		"urlToImage": "https://dynaimage.cdn.cnn.com/cnn/digital-images/org/9bca230d-2728-41a9-a253-2987db594ce3.jpg",
		"publishedAt": "2021-03-23T11:54:38Z",
		"content": "Texas GOP senator Ted Cruz announced he is reintroducing legislation that would implement stronger background checks before purchasing a firearm. \r\nDuring Cruz's opening remarks on Tuesday for the \"C… [+1381 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "By Melissa Macaya, Mike Hayes, <a href=\"/profiles/meg-wagner\">Meg Wagner</a>, <a href=\"/profiles/melissa-mahtani\" target=\"_blank\">Melissa Mahtani </a>and <a href=\"/profiles/veronica-rocha\" target=\"_blank\">Veronica Rocha</a>, CNN",
		"title": "Shooting in Boulder, Colorado: Live updates",
		"description": "Ten people, including a police officer, were killed Monday after a gunman opened fire in a grocery store in Boulder, Colorado. Follow here for the latest.",
		"url": "https://www.cnn.com/us/live-news/boulder-colorado-shooting-3-23-21/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/210323011301-boulder-colorado-shooting-tuesday-super-tease.jpg",
		"publishedAt": "2021-03-23T11:54:38Z",
		"content": "Mason Alexander was working at a tattoo parlor near the King Soopers supermarket in Boulder, Colorado, when the shooting occurred yesterday, leaving 10 dead. \r\nAlexander and his coworkers locked them… [+1288 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Michael Nedelman, CNN",
		"title": "Trial review board raises concerns about AstraZeneca vaccine data",
		"description": "The independent board that reviews data from multiple Covid-19 vaccine candidates has expressed concern over AstraZeneca's announcements on its latest findings, according to a statement posted early Tuesday by the National Institute of Allergy and Infectious …",
		"url": "http://us.cnn.com/2021/03/23/health/astrazeneca-vaccine-dsmb-statement/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/210322055442-02-astrazeneca-vaccine-0320-super-tease.jpg",
		"publishedAt": "2021-03-23T11:28:24Z",
		"content": "(CNN)The independent board that reviews data from multiple Covid-19 vaccine candidates has expressed concern over AstraZeneca's announcements on its latest findings, according to a statement posted e… [+2300 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Keith Allen, Rebekah Riess and Hollie Silverman, CNN",
		"title": "The first officer who responded to a mass shooting in Boulder was killed. He leaves behind seven children",
		"description": "Officer Eric Talley was the first officer to respond to reports of an armed man inside a grocery store in Boulder, Colorado, on Monday -- and it's where the father of seven died after actions that were described as \"heroic\" by officials.",
		"url": "http://us.cnn.com/2021/03/23/us/boulder-officer-killed-talley-profile/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/210322232935-officer-eric-talley-headshot-super-tease.jpg",
		"publishedAt": "2021-03-23T10:33:26Z",
		"content": "(CNN)Officer Eric Talley was the first officer to respond to reports of an armed man inside a grocery store in Boulder, Colorado, on Monday -- and it's where the father of seven died after actions th… [+3330 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Amir Vera, CNN",
		"title": "Witnesses describe chaos as shooter opened fire in a Colorado grocery store",
		"description": "A simple trip to the grocery store for many became a fight for survival.",
		"url": "http://us.cnn.com/2021/03/22/us/boulder-colorado-shooting-witness-accounts/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/210322201822-10-boulder-reported-shooting-0322-super-tease.jpg",
		"publishedAt": "2021-03-23T07:45:09Z",
		"content": "(CNN)A simple trip to the grocery store for many became a fight for survival Monday at a King Soopers in Boulder, Colorado. \r\nWitnesses said a person came into the grocery store in south Boulder and … [+4994 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Madeline Holcombe, CNN",
		"title": "10 dead in a mass shooting at a grocery store in Colorado -- and another community's peace is shattered",
		"description": "Ten people, including a Boulder police officer, were killed Monday after a gunman opened fire in a grocery store in Boulder, Colorado, shattering the calm for another US community.",
		"url": "http://us.cnn.com/2021/03/23/us/boulder-colorado-shooting-tuesday/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/210323011301-boulder-colorado-shooting-tuesday-super-tease.jpg",
		"publishedAt": "2021-03-23T06:12:29Z",
		"content": "(CNN)Ten people, including a Boulder police officer, were killed Monday after a gunman opened fire in a grocery store in Boulder, Colorado, shattering the calm for another US community. \r\nThe fatal s… [+5960 chars]"
	}]
}

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

    public static void main(String[] args) throws IOException, JSONException {
        String apiKey = "";
        String URL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=" + apiKey;

        JSONObject rootObject = new JSONObject(new String(Files.readAllBytes(new File("src/json/parser/data.json").toPath())));

        // Continue implementing here..
    }

}
