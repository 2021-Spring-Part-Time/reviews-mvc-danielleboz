package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review athens = new Review(1L, "Athens, Greece", "/images/athens.jpg", "Europe", "2013", "While I don’t recommend traveling to Athens in July as we did (IT’S HOT!), I do however recommend adding this city to your bucket list.  From the oldest Olympic stadium to the monumental ruins at the Acropolis, it’s easy to get lost in what this city might have been like in 450 BC. When most people think of Athens, they picture massive white-limestone columns, but, ancient Athens was a colorful city.  The thousands of sculptures and reliefs that gilded the Parthenon and other Acropolis buildings, were painted.  After the hundreds of years of exposure to the elements, the color was stripped off and what was left was the white of the limestone.  Scientist didn’t even know that sculptures in Athens were painted, until they dug up a bunch of sculptures that still had color on them.  The sculptures, whose color remained, were believed to have been buried by Athenians to preserve them when the Acropolis was set on fire.");
        Review berlin = new Review(2L, "Berlin, Germany", "/images/berlin.jpg", "Europe", "2013", "This city is steeped in drama and history as it was a pivotal place that ultimately led to the rise of the Nazi party and eventually WWII.  For me, the city has an invisible fog that hangs over the city from all the horrible things that happened here, but it’s worth the visit. Some buildings that were destroyed during WWII were rebuilt with the original charred bricks that could be salvaged, so the older buildings in Berlin look dirty as the burnt brinks are still apart of the buildings. Throughout the city, there runs a line of bricks that goes through roads and property.  This line signifies where the Berlin wall once stood to separate East and West Berlin, which only fell 31 years ago.  ");
        Review borabora = new Review(3L, "Bora Bora, French Polynesia", "/images/borabora.jpg", "Oceania", "2015", "From the year-long sun-bathing temperate and warm clear blue waters to the iconic palm tree-shaded, beach hammocks swaying in a warm breeze, this island is absolute paradise! Whether you’re looking to get away from it all on a care-free vacation or you’re looking for a bit of adventure, there is something for everyone here. Bora Bora is really a choose your own adventure kind of place. Relax by the pool or lagoon with a cocktail; get a stand-up paddle board and explore; go snorkeling; swim with stingrays or sharks; hike up the mountain; visit the town; go on a 4x4 tour; take a helicopter ride; go jet-skiing – the possibilities are truly endless.   ");
        Review dubrovnik = new Review(4L, "Dubrovnik, Croatia", "/images/dubrovnik.jpg", "Europe", "2016", "Not only was this city used as the backdrop for King’s Landing in Game of Thrones, but it used to be surrounded by a moat and every night the gates were closed and the draw bridges were pulled up until morning!   Another crazy thing about this city that many may not know, is that within our lifetime, this city was in a serious war.  In the 90’s, the country was trying to gain its independence and was at war with Serbia.  Serbs were shooting the city with mortars and if you look for it, you can see the war wounds that the city has suffered.");
        Review hongkong = new Review(5L, "Hong Kong, China", "/images/hongkong.jpg", "Asia", "2018", "The true concrete jungle.  I’ve never seen so many buildings until I traveled to Hong Kong.  It’s just an endless sea of skyscrapers.  This city has so much to offer and is actually very easy to navigate for English speakers, as the city was once a British territory.  The best views of the city are from the Peak Tower, where you can take in views of the water and the rows of endless towers that surround it.");
        Review kyoto = new Review(6L, "Kyoto, Japan", "/images/kyoto.jpg", "Asia", "2018", "If you’re looking for a place where you can experience traditional Japanese culture and architecture, look no further.  Kyoto is packed with traditional Japanese buildings and cultural traditions that go back hundreds of years.  Enjoy eating food on the floor; hike up a mountain and feed monkeys; travel through the bamboo forest; relax in an Onsen; and don’t forget to suit up in a traditional Japanese robe.");
        Review lauterbrunnen = new Review(7L, "Lauterbrunnen, Switzerland", "/images/lauterbrunnen.jpg", "Europe", "2013", "It's crazy to think this place exists.  It looks like you're looking at a postcard and that it's not actually real.  When we finally came into the town of Lauterbrunnen, which is a small town nestled in a valley between two ice peaked mountains and a massive waterfall, we couldn't help but be in awe!");
        Review paris = new Review(8L, "Paris, France", "/images/paris.jpg", "Europe", "2013 & 2016", "Out of all the places I’ve traveled, Paris is by far my favorite. Who wouldn’t want to live in a city known for its love, lights, chocolate pastries, macarons and wine?  When we traveled here, we rented an Airbnb and lived like a local. We woke up early, got a pastry and coffee, walked around the Eiffel Tower, had dinner on the side of the street, and drank wine on the shores of the river Seine.  ");
        Review rome = new Review(9L, "Rome, Italy", "/images/rome.jpg", "Europe", "2013", "Rome should top everyone’s travel list as it is such a historic city.  Be sure to make your way to the Trevi Fountain and put a coin in your right hand and then toss it over your left shoulder (over your heart).  If you do not do it properly, the Italians who are there will make you do it again. After making a wish at the Trevi, be sure to walk across town to one of my favorite structures and one of the modern wonders of the world, the Colosseum.  The Colosseum is absolutely mystifying at night when every single archway is lit up in gold.  It's hard to image what this enormous structure could have looked like when it was completed in 80 A.D. - yeah, the Colosseum is over 1,933 years old!");

        reviewsList.put(athens.getId(), athens);
        reviewsList.put(berlin.getId(), berlin);
        reviewsList.put(borabora.getId(), borabora);
        reviewsList.put(dubrovnik.getId(), dubrovnik);
        reviewsList.put(hongkong.getId(), hongkong);
        reviewsList.put(kyoto.getId(), kyoto);
        reviewsList.put(lauterbrunnen.getId(), lauterbrunnen);
        reviewsList.put(paris.getId(), paris);
        reviewsList.put(rome.getId(), rome);
    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }

}
