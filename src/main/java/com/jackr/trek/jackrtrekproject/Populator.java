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

        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
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

        Region mountainousWest = new Region("Mountainous West", northAmerica);
        Region greatPlains = new Region("Great Plains",northAmerica);
        Region canadianShield = new Region("Canadian Shield",northAmerica);
        Region variedEasternRegion = new Region("Varied Eastern Region",northAmerica);
        Region caribbean = new Region("Caribbean",northAmerica);
        Region mountainsAndHighlands = new Region("Mountains and Highlands",southAmerica);
        Region riverBasins = new Region("River Basins",southAmerica);
        Region coastalPlains = new Region("Coastal Plains",southAmerica);
        Region sahara = new Region("Sahara",africa);
        Region sahel = new Region("Sahel",africa);
        Region ethiopianHighlands = new Region("Ethiopian Highlands",africa);
        Region savanna = new Region("Savanna",africa);
        Region swahiliCoast = new Region("Swahili Coast",africa);
        Region rainForest = new Region("Rain Forest",africa);
        Region africanGreatLakes = new Region("African Great Lakes",africa);
        Region southernAfrica = new Region("Southern Africa",africa);
        Region westernUplands = new Region("Western Uplands",europe);
        Region northEuropeanPlain = new Region("North European Plain",europe);
        Region centralUplands = new Region("Central Uplands",europe);
        Region alpineMountains = new Region("Alpine Mountains",europe);
        Region mountainSystems = new Region("Mountain Systems",asia);
        Region plateaus = new Region("Plateaus",asia);
        Region plainsSteppesAndDeserts = new Region("Plains, Steppes, and Deserts",asia);
        Region freshwaterEnvironments = new Region("Freshwater Environments",asia);
        Region saltwaterEnvironments = new Region("Saltwater Environments",asia);
        Region continentalIslands = new Region("Continental Islands",australia);
        Region highIslands = new Region("High Islands",australia);
        Region lowIslands = new Region("Low Islands",australia);
        Region antarcticPeninsula = new Region("Antarctic Peninsula",antarctica);
        Region eastAntarctica = new Region("East Antarctica",antarctica);
        Region southPole = new Region("South Pole",antarctica);
        Region westAntarctica = new Region("West Antarctica",antarctica);
        Region rossSea = new Region("Ross Sea",antarctica);

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
                        "cultural landscapes of the entire valley and snow-capped mountains of Cusco.", "yes",
                "Our guide will give you a tour around Machu Picchu telling you about the history of Machu Picchu and the " +
                        "most important temples and altars.", "3-night" +
                " accommodations in 3 star hotels (Double-Occupancy).", "Pick-up and transportation from your hotel to the " +
                "start of the trail. Bus from Aguas Calientes to Machu Picchu (round trip)", "On day 5 of the trek, we will " +
                "observe a town called Collpabamba, also called the Forest Cloudy Brow where waterfalls, fruit-bearing trees, " +
                "varied flora, and birds can be observed.", "$950", "8 Days", "\"My wife and I do many" +
                " adventure trips but this one is definitely one of the best trips we experienced.\" -Robert");

        Trek trek2 = new Trek("Ultimate Peru Adventure", strenuous, southAmerica, riverBasins, "The ‘Jaguar’ is our signature, " +
                "multi-activity trip in Peru. It captures everything this beautiful country has to offer, from the towering peaks " +
                "of the Andes down to the steamy depths of the Amazon jungle.You’ll have a blast in this land of geographical and cultural extremes!",
                "yes", "Today we’ll take a short flight from Cuzco to Puerto Maldonado, a frontier town in the Amazon basin. We’ll take " +
                "to motorised canoes and glide deep into the jungle down the Tambopata River, one of the headwaters of the Amazon.",
                "Charming hotels in the cities, jungle lodge,Inca trail camping with the full support of our team.",
                "Trekking will be done on foot, bikes, and motorized canoes, along with short flights in between days to " +
                        "relocate to different areas.", "There will be plenty of free time later in the day to explore on your " +
                "own or with one of our guides.", "$3,999", "10 Days", "\"This trip was totally amazing. beautiful " +
                "scenery, wonderful guides, great food and many active adventures. - Beth");

        Trek trek3 = new Trek("Rio de Janeiro - Trekking Ilha Grande", moderate, southAmerica, coastalPlains, "It's the perfect mix " +
                "between beach, nature and culture! Get to know the fishermen communities also known as \"caiçaras\" villages, " +
                "all belonging to the famous municipality of Angra dos Reis.", "yes", "We will be visiting the beach and ruins of " +
                "the former maximum security prison that existed in the village of Dois Rios.", "Hostels, Camping and Lodges",
                "On foot", "There will be opprtunities every day to spend time on some of the nicest beaches in all of Brazil",
                "$1,378", "7 Days", "\"Lucas was a great guide and we became great friends by the end of the trip. " +
                "He spoke excellent English and knew so much about Brazil and Ilha grande.\"-Michael");

        Trek trek4 = new Trek("Top End & Kimberley Spectacular", easy, australia, continentalIslands, "Start in Darwin and " +
                "end in Broome! With the Discovery tour Top End & Kimberley Spectacular, you have a 13 days tour package taking " +
                "you through Darwin, Australia and 7 other destinations in Australia", "yes", "Visit the world’s largest " +
                "single producer of diamonds on your tour of the Argyle Diamond Mine.", "Various Cabins each night",
                "On Foot and Cruise Ship with options including camel and motorcycle rides.", "Discover the rare and beautiful " +
                "Australian South Sea Pearl on a tour of Willie Creek Pearl Farm", "$6,045", "13 Days",
                "We had a fabulous time! If there would be a complaint it would be that we had a lot more meals " +
                        "and fun than what was advertised. Can't compliment this trip enough! -Laurie");

        Trek trek5 = new Trek("The Kokoda Track", strenuous, australia, highIslands, "Start and end in Port Moresby! With " +
                "the Hiking & Trekking tour The Kokoda Track, you have a 10 days tour package taking you through Port Moresby, " +
                "Papua New Guinea and 2 other destinations in Papua New Guinea. The Kokoda Track includes accommodation in a hotel as" +
                " well as an expert guide, meals, transport and more.", "yes", "There is free time explore and visit the Kokoda Memorial and War Museum this morning before the trek begins.",
                "2 nights will be spent in hotels and 8 nights in Village community huts, or camping.", "Plane, Private Vehicle, On Foot", "Port Moresby - Bomana War Cemetery",
                "$3,515", "10 Days", "\"Base Camp was an epic, challenging adventure - made all the better for our excellent guides.\"-Andrea");

        Trek trek6 = new Trek("Cook Islands Getaway", moderate, australia, lowIslands, "Start and end in Rarotonga! With the " +
                "Explorer tour Cook Islands Getaway, you have a 6 days tour package taking you through Rarotonga, Cook Islands " +
                "and Aitutaki.", "yes", "Teariki will take you out on the lagoon’s turquoise waters for a day of sun, swimming and " +
                "snorkelling in some the lagoon’s best spots, keeping an eye out giant tropical fish and clams in the shallow waters " +
                "and soaking in some well-earned vitamin D.", "3 Nights in a Beachfront Hotel, 2 nights in a Beach Bungalow",
                "On Foot and Boat", "Travel to the local market for a look at all of the produce on sale. " +
                "Wander around, perhaps stopping to snack on some fruit, before driving to Arorangi village to meet Ngametua – a tumutoa " +
                "or Cook Islands warrior – who will introduce you to the island and community culture.", "$1,955", "6 Days",
                "\"A great team of travellers with a wonderful driver/tour guide/organiser made this trip a sensational experience. \"-Suzanne");
//
        Trek trek7 = new Trek("Sahara Desert Trek", difficult, africa, sahara, "Rediscover true adventure in the awe-inspiring Sahara Desert. " +
                "This eight day trek covers 100km passing through Morocco’s forbidding landscape punctuated by peaks, gorges, dunes and oases.",
                "yes", "Climb Jebel Lamrakeb for incredible views of the region. On day 5, camp lies at the bottom of the Bouzaine dunes, " +
                "home to some of the biggest dunes in the region and perfect for a photo or two.", "Camping with very basic facilities",
                "Foot", "Visit Saghro, a volcanic massif before reaching Mecissi", "A minimum of  $1,617.64 donated to your nominated " +
                "charity", "8 Days", "\"This trek is challenging, unforgiving, and life-changing. Prepare for very hot days and cold nights. The terrain is rocky and sandy.\"");

        Trek trek8 = new Trek("Camel Trekking In Timbuktu", strenuous, africa, sahel, "For two days you will ride to and" +
                " from base camp on the back of a camel. You will experience the peaceful quietness of the desert surrounding " +
                "Timbuktu.", "yes", "The desert around Timbuktu looks like the kind of dune system you'd find behind a beach; " +
                "it's sandy, but it's also covered in vegetation.", "Bring a tent and sleep under the stars!", "Camel",
                "Visit local villages to learn more about life in Timbuktu", "$550", "2 Days",
                "Camels walk slowly, no quicker than humans at a sedate pace, and when you combine this rocking motion " +
                        "with the deadening effect of the sand sucking up all the sound around you, you get a truly relaxing calm.");

        Trek trek9 = new Trek("Ethiopia's Simien Mountains: Trekking On The Roof Of The World", strenuous, africa, ethiopianHighlands,
                "This popular trek takes you from Debark to the Chennek campsite, which usually takes four days and includes some " +
                        "of the most fantastic scenery in the Simien Mountains.", "yes","Not to be missed is the stunning 533-meter-deep " +
                "Jinbar Waterfall, which dries up to a trickle during the dry season. Imet Gogo is another highlight of the trip. " +
                "This promontory, which stands at 3,926 meters, affords 360-degree views, arguably the best in the Simien Mountains.",
                "The campsites along this route – Sankaber, Geech and Chennek – all have adjacent community lodges which offer " +
                        "simple but delicious Ethiopian food.", "Foot", "If you are still feeling up for it, you can prolong your trip " +
                "and climb Mt. Bwahit, which at 4,430 meters, is the park’s second highest peak.", "$1,003.98", "5 Days",
                "\"Hiking the Simien Mountains is a world-class experience which offers stunning views of awe-inspiring jagged " +
                        "peaks and sharp precipices, as well as the chance to spot some endemic wildlife such as the rare Ethiopian wolf and the elusive Walia Ibex.\"");

        Trek trek10 = new Trek("Uganda Safari Trek", moderate, africa, savanna, "This Uganda Safari trek begins from and " +
                "ends in Kampala-Uganda; it will take you to the western part of the country that is gifted with various " +
                "wildlife species and beautiful sceneries.", "yes", "The main destinations in this safari are Lake Mburo " +
                "National Park, Bwindi Impenetrable Forest, Queen Elizabeth National Park, and Kibale National Park.",
                "You can choose to stay in Mihingo Lodge (Luxury), Lake Mburo Safari Lodge (Mid-range, or Eagle's Nest " +
                        "Lodge (Budget).", "Transportation to each national park will be provided by a driver guide. While " +
                "in the national parks, you will either be riding in a vehicle, walking, or on a boat cruise (Kazinga Channel).",
                "There are many different safaris and tours available nearby if you would like to extend your adventure.",
                "$1,793", "8 Days", "Everything was amazing - the communication, the ability to " +
                "customize our own safari and our FANTASTIC guide! I highly recommend using Insight Safari in Uganda. " +
                "We saw and learned so much! Thank you for making our trip so enjoyable!");

        Trek trek11 = new Trek("Explore the Swahili Coast - Sawa Sawa Dhow Excursion", easy, africa, swahiliCoast, "Sawa Sawa " +
                "Dhow Excursion Malindi Day Trip is a full day sailing and snorkling tour. Considered one of the top 10 attractions " +
                "when visiting Malindi –Sawa Sawa Dhow excursion includes sailing slowly along the coast, exploring other beaches on the Island, " +
                "swimming, fishing, snorkeling, diving and a delicious fresh seafood lunch and drinks on board.", "yes",
                "While on the Sawa Sawa Dhow Excursion, visit the Malindi Marine Park or the Mayungu Lagoon and sand bar.",
                "There are plenty of Kenya hotels and resorts located along the Swahili coast, but you could choose to stay at the " +
                        "Che Shale Hotel which is where the dhow is situated. The Che Shale Hotel is a chic beach retreat in Mambrui.",
                "A dhow ride on Sawa Sawa takes groups of 10 or less on a marine safari exciting adventure. Whether you want to " +
                        "head out of some snorkeling or a romantic sunset cruise, Sawa Sawa is the perfect vessel!",
                "Relax by the Indian Ocaen, go on Game drives, and take part in river excursions while exploring the Swahili Coast.",
                "$29.13 per adult", "Day trip (3 hours)", "\"We had an incredible trip in the turquoise and transparent sea of" +
                " the Kenya coasts. We swam with colorful fish and had beautiful walks on the white sand. It was wonderful to sail in a traditional wood boat, " +
                "eating fresh sea food and having so much fun with the crew. So comfortable to lie and relax on the big pillows watching the sea, the fish, and the sky!\"");

        Trek trek12 = new Trek("Congo Gorillas And Ultimate Jungle Safari", moderate, africa, rainForest, "This tour covers and includes entrance to both Lake Tele and Nouabalé-Ndoki " +
                "National Parks, the crowning jewels of African game parks and the most untouched wildlife reserves on the continent.",
                "yes", "Ranked as one of the top countries to visit in 2013 by the New York Times, this part of the Congo has become a fantasy destination for ecotourism. In the heart of the " +
                "Congo Basin, is the world’s second largest tropical rain forest after the Amazon.", "You will stay in a hotel on the second night, and various campsites after that",
                "4x4, Motorized canoe, and by foot", "There are many trails and tours available nearby for exploring!",
                "$9,659", "18 Days", "\"Had a fantastic trip with Gorillas and Wildlife!! From the planning ahead of time with Ivan, to the tour itself with Richard, it went smoothly and I had " +
                "a great time! Visiting the gorillas is a very special experience that I highly recommend.");

        Trek trek13 = new Trek("Great Lakes, Gorillas, And More", moderate, africa, africanGreatLakes, "We will cross Lake Kivu, one of Africa's Great Lakes and enjoy many different hikes visiting gorilla families.",
                "yes", "While on this tour, take some time to visit Nyiragongo, a live and quite active volcano.", "You will be staying in hotels and camps",
                "Transfers during the tour will be provided.", "Take some city tours, visit the Canopy Walk, and take a speed boat out on Lake Kivu.",
                "$6,240", "11 Days", "\"We had a great time on the lake and getting to visit the gorillas on land. We were able to see quite a few gorilla families on our trip.\"");

        Trek trek14 = new Trek("The Amatola Trail", difficult, africa, southernAfrica, "You should set aside about a week or so to travel the 100-km path, which will take you to some of the most impressive highland scenery in the entire country!",
                "no", "On this hike, you’ll find waterfalls, rock pools to cool off in the summer heat and some pretty sweet panoramic views of the valley below.",
                "Bring a tent and sleep under the stars!", "Provide your own transportation to the trail. Then you will hike on foot.",
                "The hike ends in Hogsback, which in and of itself is known for its rather surreal (almost other-worldly) beauty. When you’re here, be sure to check out the beautiful Eco-shrine created by Diana Graham.",
                "$1,200", "7 Days", "\"Although this is a long and quite challenging trail, the beauty of this trek makes the sweat and strain well-worth the journey and hands down of the best hikes in South Africa!\"");

        Trek trek15 = new Trek("Antarctic Base Camp Exepedition Cruise", easy, antarctica, antarcticPeninsula, "On this journey, you will encounter humpback and minke whales near Lemaire Channel, hike near the shore or trek to hilltops for panoramic views, view Adelie " +
                "and gentoo penguin colonies, and kayak between icebergs in the polar waters while searching for wildlife.", "yes", "An epic landscape of mammoth glaciers and endless wind-carved snow, Neko Harbour offers opportunities for a Zodiac cruise and landing that afford " +
                "the closest views of the surrounding alpine peaks.", "You will be staying on your assigned vessel.", "Voyage aboard the designated vessel",
                "Keep a sharp lookout for humpback whales in Dallmann Bay. Also, shoot for Half Moon Island, in the South Shetlands, with further chances for activities.",
                "$9,050", "12 Days", "\"I could not be happier with my Adventure Life experience, from beginning to end. I travel a lot, and I think your company and personnel do an outstanding job!\"");

        Trek trek16 = new Trek("East Antarctica Cruise: Walk In The Footsteps Of History", easy, antarctica, eastAntarctica,
                "On this journey, you will cruise at sea in East Antarctica. You will also visit numerous islands including the Snares Islands, the Auckland Islands, and the Macquarie Island.",
                "yes", "One of the most isolated areas on our planet, East Antarctica is a land of towering polar ice caps and wildlife-rich seas.",
                "You will be staying on the ship in either a basic room, a double room, or a suite.", "You will travel by ship",
                "Explore the shore landings, go kayaking, skiing, snowsheing, and wildlife watching while in East Antarctica.",
                "$16,000", "27 Days", "\"The East Antarctica Cruise is a fantastic way to experience an incredibly wealth of wildlife and history as you venture along a coast that few people have ever witnessed.\"");

        Trek trek17 = new Trek("South Pole Last Degree", strenuous, antarctica, southPole, "To ski across the Antarctic plateau to the South Pole " +
                "is an experience very few will realise. It remains as one of the most exacting environments on earth - cold, brittle, windswept, " +
                "and remote - the very reason we offer such an expedition.", "yes", "The South Pole is home to many penguins and is covered in snow and ice.",
                "Camp in expedition tents", "You will be transferred by flight and you will be skiing / walking on the ice.",
                "You will experience twenty-four hour daylight so there's no shortage of time to really see and feel the true Antarctica.",
                "$65,790", "6 to 8 Days", "\"This trip is so much fun but it's also dangerous. Make sure you come prepared and listen to your tour guide.\"");

        Trek trek18 = new Trek("Antarctic Special - Discovery and Learning Voyage", moderate, antarctica, westAntarctica, "The seabirds of the South Shetlands, the ice formations of Antarctic Sound, the whale hotspots of Wilhelmina Bay – all of these experiences and more " +
                "await you on this exploratory expedition cruise, which focuses not only on visiting Antarctica’s most iconic locations but also its most beloved wildlife. Penguins included.",
                "yes", "West Antarctica is covered by the West Antarctic Ice Sheet. You can also find the volcanic islands of the South Shetlands here.",
                "You will be staying on the ship in a cabin size of your choice.", "You will be sailing on a ship and exploring the land on foot.",
                "You may be able to engage in activities near Half Moon Island. Here chinstrap penguins and Weddell seals often haul out onto the beach near Cámara Base, an Argentine scientific research station.",
                "$9,100", "12 Days", "\"As a kid, I read about Ernest Shackleton, and I have always been fascinated by the desolation of our southernmost continent. Even today, modern day adventurers can still get a sense of the history and astonishing bravery of those first explorers\".");

        Trek trek19 = new Trek("Ross Sea Antarctic Journey", easy, antarctica, rossSea, "Sail along the floating mass of land-ice known as the Ross Ice Shelf.",
                "yes", "Here, you will see the impressive Ross Ice Shelf - the world's largest and the Transantarctic Mountain Chain.",
                "You will be staying on the ship in a cabin size of your choice.", "Voyage aboard the designated vessel as indicated in the itinerary. Helicopter transfers are provided.",
                "Your journey to this unique part of the Antarctic waters will likely include stops in New Zealand, Macquarie Island, the Snares, and the Antarctic Peninsula.",
                "$28,450","33 Days", "\"The trip might have been the absolute best of our lifetime. We particularly want to commend our guide Peter in the Guilin area-he was so incredibly attentive, energetic, and enthusiastic.\"");

        Trek trek20 = new Trek("Rocky Mountain National Park, Colorado", strenuous, northAmerica, mountainousWest, "Travel the beautiful Rocky Mountain National Park. Travel with our guides an average of 6-9 miles per day. See gorgeous Bear Lake on day 1 as we move upland to the culmination of our trek on " +
                "day 5 - crossing the Continental Divide.", "yes", "Sets out from the beautiful Beaver Meadows Visitor Center (a National Historic Landmark designed by Frank Lloyd Wright). This trek provides plenty of natural vistas and pristine wilderness.",
                "Overnight stays are provided in two-person cabins along the trail. If you require a single-person cabin or special accommodations, please contact our travel office.",
                "Busses are provided for long-distance travel between landmarks.", "You'll be close enough to nearby towns to call a taxi to local restaurants.",
                "$1,650", "6 Days", "\"My children and I loved it.\" - Bob K., Chicago");

        Trek trek21 = new Trek("Great Plains Trail Network", easy, northAmerica, greatPlains, "Chose from a number of excursions along the 134-miles of trails outside Lincoln, Nebraska. We can draw up personalized routes for you and make hotel or campsite accommodations along the way.",
                "no", "Travel one of North America's newest trails. You'll travel along part of the historic Oregon Trail. Attractions at your starting point in Lincoln include the Lincoln Children's Zoo and the Museum of American Speed.",
                "It's up to you! Stay in a number of camps or cabins along the various rotes, or make it into a nearby hotel.", "Given the easy terrain and infrastructure in the area, you have the choice whether to walk or bike these trails. Or rent a horse and ride!", "Hiking available on many " +
                "different trails", "$1,300", "3-9 Days", "\"I've never seen so much corn. Nor did I ever think I would enjoy seeing so much!\" - Christine P., New York, NY");

        Trek trek22 = new Trek("Canadian Shield Canoeing", moderate, northAmerica, canadianShield, "Start and end in Algonquin Park. With this package we'll provide you a personalized itinerary on this trip through a beautiful Canadian national park",
                "yes", "With many moose in the area, you're sure to see one along with other wildlife such as fish and deer.",
                "Camping will be on the side of the river when we break for the night.", "We'll provide busses to and from the local airport. Fee includes airfare.",
                "Optional hiking after we've stopped for the night to make camp.", "$2,100", "4 Days",
                "\"Lovely lakes, many interesting furry animals. Including the majestic moose.\" - Eric I, London, England");

        Trek trek23 = new Trek("Acadia National Park", moderate, northAmerica, variedEasternRegion, "Take a 45-mile bike journey through the Maine woods on well-marked trails. Daily detours are available to local towns or to see the beautiful coastline.",
                "no", "Visit the rural towns of Maine such as Rockland or Camden or the port of Bar Harbor.", "Campsites or cabins available depending on your needs.",
                "Provide your own transportation to and from the area. Bikes are available for rent.", "Hiking and dining are available at your leisure.",
                "$125 per night", "As many nights as you wish.", "\"Maine is beautiful and our cabins were beautiful too\" - Samantha R., St. Louis, MO");

        Trek trek24 = new Trek("Waitukubuli National Trail", moderate, northAmerica, caribbean, "Dominica's Waitukubli National Trail is the longest trekking trail in the Caribbean. At 115 miles, it winds through the island's lush volcanic interior from the southern end to the northern tip. Traveling here was listed as one of National " +
                "Geographic's \"50 Tours of a Lifetime\"", "yes", "Waterfalls and dynamic natural vistas", "Overnight stays will be varied. Some nights in cabins, some in tents, and some in local villiages.",
                "On foot. Airfare packages are available.", "Plenty of trails to hike", "$1,500 ($700 airfare per person, if desired)",
                "10 Days", "\"I love the Caribbean but I've never experienced from anything other than a cruise ship. This was way better\" - Mel V., Baltimore, MD");

        Trek trek25 = new Trek("Denmark Family Bike Trek", easy, europe, westernUplands, "This guided trek tour begins each day at 9:00 a.m. when you will be shuttled to various locations in Denmark to enjoy bike trails in the colorful Danish countryside. You'll visit landmarks, elegant restaurants and local stores.",
                "yes", "You'll visit the port town of Odense, filled with galleries and shops. Then explore  Egeskov Slot, Denmark’s best- preserved island castle. Sample havarti cheeses after biking to a dairy farm and explore the research aquarium in Kerteminde.",
                "You'll be staying in the Lykkesholm Slot Hotel for the first 3 nights after which we will bike to the Munkebo Kro seaside inn for the next two nights.",
                "Shuttle buses will transport you to your bike trail for the day where you will ride to your scheduled destinations.",
                "There will be scavenger hunts for the children, picnics, a 200 year old garden maze, fishing, and beach activities.",
                "$3,500", "5 nights, 6 days", "\"I've never biked so far for Danish cheese before. It was worth it!\" - Brie Havarti, Great Falls, MT");

        Trek trek26 = new Trek("Germany Trekking the Malerweg Trail", difficult, europe, northEuropeanPlain, "The Elbe Sandstone Mountains are one of the most beautiful regions in Germany. You will see bizarre rock formations, walk through ancient woods and picturesque valleys alongside the winding Elbe River.",
                "yes", "The painters path, local villages and guesthouses.", "4 nights in 3-star hotels and 3 nights in local guesthouses. All rooms have been carefully hand-picked and monitored for quality.",
                "You'll be walking all the way! We will however transfer your luggage from hotel to hotel on all walking days.", "There are many nearby trails to explore " +
                "if you wish to extend your trip", "$3,700", "7 nights, 8 days", "\"This was the longest walk we ever took and we weren't bored for a minute! The area is beautiful and the guides weren't too drunk. It was great!\"  -Tipsy T. , Cleveland, OH");

        Trek trek27 = new Trek("Austria Self Guided Walking Tour", moderate, europe, centralUplands, "This area of Western Austria invites the trekker to enjoy walks with alpine meadows, wonderful mountain views and delightful lakes. Paths are well marked and with our walk booklet " +
                "that we have prepared, you will not get lost.", "no", "You'll see Zugspitze, Germany's highest mountain, old towns and shops.",
                "3-star hotels along the trail.", "You'll mostly be walking with some shuttle options throughout the trek.",
                "Ski resorts, mountain trains, and cocktail hours.", "$2,300", "6 nights 7 days",
                "\"It was wonderful fun navigating the hand written guide books and walking through such lovely scenery while we were lost! We also survived the hotels! What a grand adventure!\" -Tommy Z. , Georgetown, KY");

        Trek trek28 = new Trek("Italian Dolomites Alpine Mountain Trek", moderate, europe, alpineMountains, "This amazing trip follows a gorgeous itinerary through unforgettable mountains with stunning views, charming accommodations and gourmet cuisine.",
                "yes", "The Dolomites are a recognized UNESCO World Heritage Site, valued for it's exceptional natural beauty. Geologically distinct and unusually shaped, they have inspired artists, scientists and outdoor enthusiasts for centuries.",
                "Since 1910 the Hotel Villa has been hosting adventurous visiters. Built from locally sourced materials provided by the mountains, this amazing lodge blends into the mountains while offering cozy rooms.", "There will be a shuttle transport each day to your hiking location and then back to the hotel in the evenings.",
                "All day hikes, enjoying nature and dining with the other travelers.", "$3,150", "6 nights, 7 days",
                "\"This was most relaxing adventure I've ever experienced! The scenery was just amazing.\" - Peter Q. , Reno, NV");

        Trek trek29 = new Trek("Lenin Peak, Kyrgyzstan", moderate, asia, mountainSystems, "Rising to 7,134 meters in elevation, Lenin peak is a popular mountaineering destination for climbers in the know and is also considred to be one of the easiest 7000ers from a technical standpoint.",
                "yes", "The peak straddles the Kyrgyz-Tajiki border and towers above lush green valleys as well as the encampments of the native nomadic inhabitants.",
                "You start at basecamp at the base and from there you camp on the hill the next few days.", "You will be picked up from the aitport by your guide and provide transportation to the base camp, Then the trek itself is on foot.",
                "While there you can check out the Inylchek Glaciers, a more challenging 11 day adventure.", "$3,600", "21 days",
                "\"I couldnt think of anything funner than spending almost a month climbing 7,000 meters in the freezing cold, 10/10 would do it again\" - Michael Diamond, New York, NY");

        Trek trek30 = new Trek("Mt. Gongga of East Tibetan Plateau", moderate, asia, plateaus, "Start and end in Chengdu! With the hiking and trekking tour Mt. Gongga of East Tibetan Plateau, You have a 8 day tour taking you through Chengdu, China and Kangding",
                "yes", "Watch out or youll miss Mt. Gongga on this trek!", "The guide will provide camping gear, including tents, table, chairs, sleeping , mats and food.",
                "To get to the trek you will need to take a local long distance bus between Chengdu and Kangding.",
                "There is little entertainment around the trek path.", "$2,000", "8 days",
                "\"Trekking through the Mt. Gongga Plateau was the craziest experience of my life!\" - Adam Yauch, Brooklyn, NY");

        Trek trek31 = new Trek("Spice Trails of Jordan", strenuous, asia, plainsSteppesAndDeserts, "Start and end in Amman! With the Spice Trails of Jordan trek you have an eight day tour package taking you through Amman, Jordan and 7 other destinations in Jordan.",
                "yes", "You will see amazing citys like Wadi Rum, Petra, Kerak and others.", "3 Nights in a hotel and 4 nights spend camping.",
                "You will be transported through the trek with a 4wd bus.", "There are endless things to do at all the nearby cities.",
                "$1,500", "8 days", "\"Trekking through the desert and all the amazing citys was great!!\" -  Adam Horovitz, New York, NY");

        Trek trek32 = new Trek("Great Baikal Trail", easy, asia, freshwaterEnvironments, "Hike around the Worlds largest, deepest and old lake in the world! Take a 14 mile hike through the Pribaikalsky National Park through the siberian forest and along the shores of Lake Baikal.",
                "no", "On this trek you will walk through the siberian forest past a water fall, meadows and views of other lakes.",
                "You need a permit from the park to camp out.", "N/A", "What other activites do you need when hiking past waterfalls to the oldest lake in the world.",
                "$0", "6 hours", "\"It was mindblowing seeing the largest, and oldest lake in the world!\" - Marty McFly, Hill Valley, CA");

        Trek trek33 = new Trek("Pianemo Beach Kayaking", easy, asia, saltwaterEnvironments, "Kayak around more than 1,500 small islands in west Papua, through the crystal clear waters and the soft ringing of the sea lapping the shore.",
                "no", "A place you have to go is the wooden view point at the top of the cliff, it gives you an amazing view of the bay.",
                "No camping", "During the trek you will use a kayak go travel.", "There are several options to rock climb and scuba dive in the area.",
                "$200", "As long as your heart desires", "\"Roads? Where we're going, we don't need roads. - Dr. Emmett Brown, Hill Valley, CA");

        trekRepo.save(trek1);
        trekRepo.save(trek2);
        trekRepo.save(trek3);
        trekRepo.save(trek4);
        trekRepo.save(trek5);
        trekRepo.save(trek6);
        trekRepo.save(trek7);
        trekRepo.save(trek8);
        trekRepo.save(trek9);
        trekRepo.save(trek10);
        trekRepo.save(trek11);
        trekRepo.save(trek12);
        trekRepo.save(trek13);
        trekRepo.save(trek14);
        trekRepo.save(trek15);
        trekRepo.save(trek16);
        trekRepo.save(trek17);
        trekRepo.save(trek18);
        trekRepo.save(trek19);
        trekRepo.save(trek20);
        trekRepo.save(trek21);
        trekRepo.save(trek22);
        trekRepo.save(trek23);
        trekRepo.save(trek24);
        trekRepo.save(trek25);
        trekRepo.save(trek26);
        trekRepo.save(trek27);
        trekRepo.save(trek28);
        trekRepo.save(trek29);
        trekRepo.save(trek30);
        trekRepo.save(trek31);
        trekRepo.save(trek32);
    }
}