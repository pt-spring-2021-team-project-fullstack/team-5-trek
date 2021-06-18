package com.jackr.trek.jackrtrekproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TrekRepository trekRepo;

    @Resource
    private TrekTypeRepository trekTypeRepo;

    @Resource
    private ContinentRepository continentRepo;

    @Resource
    private RegionRepository regionRepo;

    @Override
    public void run(String... args) throws Exception {

        TrekType easy = new TrekType("Easy");
        TrekType moderate = new TrekType("Moderate");
        TrekType strenuous = new TrekType("Strenuous");
        TrekType difficult = new TrekType("Difficult");
        trekTypeRepo.save(easy);
        trekTypeRepo.save(moderate);
        trekTypeRepo.save(strenuous);
        trekTypeRepo.save(difficult);

        Continent northAmerica = new Continent("North_America");
        Continent southAmerica = new Continent("South_America");
        Continent africa = new Continent("Africa");
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Australia");
        Continent antarctica = new Continent("Antarctica");
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(africa);
        continentRepo.save(europe);
        continentRepo.save(asia);
        continentRepo.save(australia);
        continentRepo.save(antarctica);

        Region mountainousWest = new Region("Mountainous_West", northAmerica);
        Region greatPlains = new Region("Great_Plains",northAmerica);
        Region canadianShield = new Region("Canadian_Shield",northAmerica);
        Region variedEasternRegion = new Region("Varied_Eastern_Region",northAmerica);
        Region caribbean = new Region("Caribbean",northAmerica);
        Region mountainsAndHighlands = new Region("Mountains_and_Highlands",southAmerica);
        Region riverBasins = new Region("River_Basins",southAmerica);
        Region coastalPlains = new Region("Coastal_Plains",southAmerica);
        Region sahara = new Region("Sahara",africa);
        Region sahel = new Region("Sahel",africa);
        Region ethiopianHighlands = new Region("Ethiopian_Highlands",africa);
        Region savanna = new Region("Savanna",africa);
        Region swahiliCoast = new Region("Swahili_Coast",africa);
        Region rainForest = new Region("Rain_Forest",africa);
        Region africanGreatLakes = new Region("African_Great_Lakes",africa);
        Region southernAfrica = new Region("Southern_Africa",africa);
        Region westernUplands = new Region("Western_Uplands",europe);
        Region northEuropeanPlain = new Region("North_European_Plain",europe);
        Region centralUplands = new Region("Central_Uplands",europe);
        Region alpineMountains = new Region("Alpine_Mountains",europe);
        Region mountainSystems = new Region("Mountain_Systems",asia);
        Region plateaus = new Region("Plateaus",asia);
        Region plainsSteppesAndDeserts = new Region("Plains,_Steppes,_and_Deserts",asia);
        Region freshwaterEnvironments = new Region("Freshwater_Environments",asia);
        Region saltwaterEnvironments = new Region("Saltwater_Environments",asia);
        Region continentalIslands = new Region("Continental_Islands",australia);
        Region highIslands = new Region("High_Islands",australia);
        Region lowIslands = new Region("Low_Islands",australia);
        Region antarcticPeninsula = new Region("Antarctic_Peninsula",antarctica);
        Region eastAntarctica = new Region("East_Antarctica",antarctica);
        Region southPole = new Region("South_Pole",antarctica);
        Region westAntarctica = new Region("West_Antarctica",antarctica);
        Region rossSea = new Region("Ross_Sea",antarctica);

        regionRepo.save(mountainousWest);
        regionRepo.save(greatPlains);
        regionRepo.save(canadianShield);
        regionRepo.save(variedEasternRegion);
        regionRepo.save(caribbean);
        regionRepo.save(mountainsAndHighlands);
        regionRepo.save(riverBasins);
        regionRepo.save(coastalPlains);
        regionRepo.save(sahara);
        regionRepo.save(sahel);
        regionRepo.save(ethiopianHighlands);
        regionRepo.save(savanna);
        regionRepo.save(swahiliCoast);
        regionRepo.save(rainForest);
        regionRepo.save(africanGreatLakes);
        regionRepo.save(southernAfrica);
        regionRepo.save(westernUplands);
        regionRepo.save(northEuropeanPlain);
        regionRepo.save(centralUplands);
        regionRepo.save(alpineMountains);
        regionRepo.save(mountainSystems);
        regionRepo.save(plateaus);
        regionRepo.save(plainsSteppesAndDeserts);
        regionRepo.save(freshwaterEnvironments);
        regionRepo.save(saltwaterEnvironments);
        regionRepo.save(continentalIslands);
        regionRepo.save(highIslands);
        regionRepo.save(lowIslands);
        regionRepo.save(antarcticPeninsula);
        regionRepo.save(eastAntarctica);
        regionRepo.save(southPole);
        regionRepo.save(westAntarctica);
        regionRepo.save(rossSea);

        Trek trek1 = new Trek("Cusco & Salkantay Trekking to Machu Picchu", strenuous, southAmerica, mountainsAndHighlands,
                "With this fabulous 8-day package, you can experience the most impressive and charming natural and " +
                        "cultural landscapes of the entire valley and snow-capped mountains of Cusco.", true,
                "Our guide will give you a tour around Machu Picchu telling you about the history of Machu Picchu and the " +
                        "most important temples and altars.", "3-night" +
                " accommodations in 3 star hotels (Double-Occupancy).", "Pick-up and transportation from your hotel to the " +
                "start of the trail. Bus from Aguas Calientes to Machu Picchu (round trip)", "On day 5 of the trek, we will " +
                "observe a town called Collpabamba, also called the Forest Cloudy Brow where waterfalls, fruit-bearing trees, " +
                "varied flora, and birds can be observed.", "$950", "8 Days", "\"My wife and I do many" +
                " adventure trips but this one is definitely one of the best trips we experienced. -Robert");

        Trek trek5 = new Trek("Top End & Kimberley Spectacular", easy, australia, continentalIslands, "Start in Darwin and " +
                "end in Broome! With the Discovery tour Top End & Kimberley Spectacular, you have a 13 days tour package taking " +
                "you through Darwin, Australia and 7 other destinations in Australia", true, "Visit the world’s largest " +
                "single producer of diamonds on your tour of the Argyle Diamond Mine.", "Various Cabins each night",
                "On Foot and Cruise Ship with options including camel and motorcycle rides.", "Discover the rare and beautiful " +
                "Australian South Sea Pearl on a tour of Willie Creek Pearl Farm", "$6,045", "13 Days",
                "We had a fabulous time! If there would be a complaint it would be that we had a lot more meals " +
                        "and fun than what was advertised. Can't compliment this trip enough! -Laurie");

        Trek trek8 = new Trek("Sahara Desert Trek", difficult, africa, sahara, "Rediscover true " +
                "adventure in the awe-inspiring Sahara Desert. This eight day trek covers 100km passing through Morocco’s" +
                " forbidding landscape punctuated by peaks, gorges, dunes and oases.", true, "Climb " +
                "Jebel Lamrakeb for incredible views of the region. On day 5, camp lies at the bottom of the Bouzaine dunes, " +
                "home to some of the biggest dunes in the region and perfect for a photo or two.",
                "Camping with very basic facilities", "Foot", "Visit Saghro, a volcanic" +
                " massif before reaching Mecissi", "A minimum of  $1617.64 donated to your nominated charity",
                "8 days", "This trek is challenging, unforgiving, and life-changing. Prepare for very hot " +
                "days and cold nights. The terrain is rocky and sandy.");

        Trek trek9 = new Trek("Camel Trekking In Timbuktu", strenuous, africa, sahel, "For two days you will ride to and" +
                " from base camp on the back of a camel. You will experience the peaceful quietness of the desert surrounding " +
                "Timbuktu.", true, "The desert around Timbuktu looks like the kind of dune system you'd find behind a beach; " +
                "it's sandy, but it's also covered in vegetation.", "Bring a tent and sleep under the stars!", "Camel",
                "Visit local villages to learn more about life in Timbuktu", "$550", "2 Days",
                "Camels walk slowly, no quicker than humans at a sedate pace, and when you combine this rocking motion " +
                        "with the deadening effect of the sand sucking up all the sound around you, you get a truly relaxing calm.");

        Trek trek11 = new Trek("Uganda Safari Trek", moderate, africa, savanna, "This Uganda Safari trek begins from and " +
                "ends in Kampala-Uganda; it will take you to the western part of the country that is gifted with various " +
                "wildlife species and beautiful sceneries.", true, "The main destinations in this safari are Lake Mburo " +
                "National Park, Bwindi Impenetrable Forest, Queen Elizabeth National Park, and Kibale National Park.",
                "You can choose to stay in Mihingo Lodge (Luxury), Lake Mburo Safari Lodge (Mid-range, or Eagle's Nest " +
                        "Lodge (Budget).", "Transportation to each national park will be provided by a driver guide. While " +
                "in the national parks, you will either be riding in a vehicle, walking, or on a boat cruise (Kazinga Channel).",
                "There are many different safaris and tours available nearby if you would like to extend your adventure.",
                "$1,793", "8 Days", "Everything was amazing - the communication, the ability to " +
                "customize our own safari and our FANTASTIC guide! I highly recommend using Insight Safari in Uganda. " +
                "We saw and learned so much! Thank you for making our trip so enjoyable!");

        trekRepo.save(trek1);
        trekRepo.save(trek5);
        trekRepo.save(trek8);
        trekRepo.save(trek9);
        trekRepo.save(trek11);
    }
}