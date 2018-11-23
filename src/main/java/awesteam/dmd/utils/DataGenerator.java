package awesteam.dmd.utils;

public class DataGenerator {

    public static int generateRandomInteger(int min, int max) {
        assert max >= min;
        return min + (int) (Math.random() * (max - min));
    }

    public static String generateRandomName() {
        return NAMES[generateRandomInteger(0, NAMES.length - 1)];
    }

    public static String generateRandomSurname() {
        return SURNAMES[generateRandomInteger(0, SURNAMES.length - 1)];
    }

    public static String generateRandomCity() {
        return CITIES[generateRandomInteger(0, CITIES.length-1)];
    }

    public static String generateRandomStreet() {
        return STREETS[generateRandomInteger(0, STREETS.length - 1)];
    }

    public static String generateRandomAddress() {
        return generateRandomInteger(0, 220) + " " +
                generateRandomStreet() + ", " +
                generateRandomCity();
    }

    public static String generateRandomString(int length) {
        assert length >= 0;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(generateRandomChar());
        }
        return sb.toString();
    }

    public static char generateRandomChar() {
        if (Math.random() > 0.5) {
            return (char) ('a' + (int) (('z' - 'a') * Math.random()));
        } else {
            return (char) ('A' + (int) (('Z' - 'A') * Math.random()));
        }
    }

    private static final String[] NAMES = new String[]{
            "Liam", "Emma", "Noah", "Olivia",
            "Mason", "Ava", "Ethan", "Sophia",
            "Logan", "Isabella", "Lucas", "Mia",
            "Jackson", "Charlotte", "Aiden", "Amelia",
            "Oliver", "Emily", "Jacob", "Madison",
            "Elijah", "Harper", "Alexander", "Abigail",
            "James", "Avery", "Benjamin", "Lily",
            "Jack", "Ella", "Luke", "Chloe",
            "William", "Evelyn", "Michael", "Sofia",
            "Owen", "Aria", "Daniel", "Ellie",
            "Carter", "Aubrey", "Gabriel", "Scarlett",
            "Henry", "Zoey", "Matthew", "Hannah",
            "Wyatt", "Audrey", "Caleb", "Grace",
            "Jayden", "Addison", "Nathan", "Zoe",
            "Ryan", "Elizabeth", "Isaac", "No"
    };

    private static final String[] SURNAMES = new String[]{
            "Adams", "Aldridge", "Alexander", "Alison", "Alix", "Allen", "Anderson",
            "Bailey", "Baker", "Barber", "Barlow", "Barrett", "Bee", "Bell", "Bennett",
            "Benson", "Bentley", "Beverly", "Black", "Bradley", "Brett", "Bronte", "Brooke",
            "Brooks", "Brown", "Bruce", "Burgess", "Burney", "Burns", "Byrne",
            "Campbell", "Carr", "Carson", "Carter", "Clark", "Cole", "Collins", "Cooper",
            "Cox", "Crawford", "Crystal",
            "Davis", "Day", "Dean", "Dee",
            "Eden", "Edwards", "Ellis", "Evans",
            "Farrell", "Fisher", "Florence", "Ford", "Foster", "Franklin",
            "George", "Gibson", "Gordon", "Graham", "Grant", "Green",
            "Haley", "Hall", "Harris", "Hart", "Hicks", "Hill", "Horne", "Howard", "Hughes", "Hunt",
            "Jackson", "James", "Jean", "Johnson", "Jones", "Jordan", "Joy",
            "Kimberly", "King", "Knight",
            "Lane", "Lewis", "Lindsay", "Little", "Love", "Lynn",
            "Martin", "Meredith", "Miller", "Mills", "Mitchell", "Moore", "Morgan",
            "Nelson", "Norman",
            "Palmer", "Peters", "Phillips",
            "Ray", "Roberts", "Robin", "Robinson",
            "Scott", "Simon", "Smith", "Starr", "Stevens", "Stone",
            "Taylor", "Thomas", "Toni", "Tucker",
            "Walker", "Wallace", "Ward", "Washington", "Waters", "West", "White",
            "Williams", "Wilson", "Wright",
            "Young",
    };

    private static final String[] STREETS = new String[]{
            "Oxford street", "Baker street",
            "Bond street", "Victory street",
            "Brown street", "High street",
            "Bird street", "Wolf avenue",
            "Bytecode road", "Segfault street",
            "Noisy street", "Oxnard street",
            "Helmet street", "Wall street",
            "Whitehall street", "Carnaby street",
            "Abbey road", "Downing street",
            "Piccadilly Circus",
    };

    private static final String[] CITIES = new String[]{
            "Abilene, Texas",
            "Akron, Ohio",
            "Albuquerque, New Mexico",
            "Alexandria, Virginia",
            "Allentown, Pennsylvania",
            "Amarillo, Texas",
            "Anaheim, California",
            "Anchorage, Alaska",
            "Ann Arbor, Michigan",
            "Antioch, California",
            "Arlington, Texas",
            "Arlington, Virginia",
            "Arvada, Colorado",
            "Athens, Georgia",
            "Atlanta, Georgia",
            "Augusta, Georgia",
            "Aurora, Colorado",
            "Aurora, Illinois",
            "Austin, Texas",
            "Bakersfield, California",
            "Baltimore, Maryland",
            "Baton Rouge, Louisiana",
            "Beaumont, Texas",
            "Bellevue, Washington",
            "Berkeley, California",
            "Billings, Montana",
            "Birmingham, Alabama",
            "Boise, Idaho",
            "Boston, Massachusetts",
            "Boulder, Colorado",
            "Bridgeport, Connecticut",
            "Brownsville, Texas",
            "Buffalo, New York",
            "Burbank, California",
            "Cambridge, Massachusetts",
            "Cape Coral, Florida",
            "Carrollton, Texas",
            "Cary, North Carolina",
            "Cedar Rapids, Iowa",
            "Centennial, Colorado",
            "Chandler, Arizona",
            "Charleston, South Carolina",
            "Charlotte, North Carolina",
            "Chattanooga, Tennessee",
            "Chesapeake, Virginia",
            "Chicago, Illinois",
            "Chula Vista, California",
            "Cincinnati, Ohio",
            "Clarksville, Tennessee",
            "Clearwater, Florida",
            "Cleveland, Ohio",
            "Colorado Springs, Colorado",
            "Columbia, South Carolina",
            "Columbia, Missouri",
            "Columbus, Ohio",
            "Columbus, Georgia",
            "Concord, California",
            "Coral Springs, Florida",
            "Corona, California",
            "Corpus Christi, Texas",
            "Costa Mesa, California",
            "Dallas, Texas",
            "Daly City, California",
            "Davenport, Iowa",
            "Dayton, Ohio",
            "Denton, Texas",
            "Denver, Colorado",
            "Des Moines, Iowa",
            "Detroit, Michigan",
            "Downey, California",
            "Durham, North Carolina",
            "El Monte, California",
            "El Paso, Texas",
            "Elgin, Illinois",
            "Elizabeth, New Jersey",
            "Elk Grove, California",
            "Erie, Pennsylvania",
            "Escondido, California",
            "Eugene, Oregon",
            "Evansville, Indiana",
            "Fairfield, California",
            "Fayetteville, North Carolina",
            "Flint, Michigan",
            "Fontana, California",
            "Fort Collins, Colorado",
            "Fort Lauderdale, Florida",
            "Fort Wayne, Indiana",
            "Fort Worth, Texas",
            "Fremont, California",
            "Fresno, California",
            "Frisco, Texas",
            "Fullerton, California",
            "Gainesville, Florida",
            "Garden Grove, California",
            "Garland, Texas",
            "Gilbert, Arizona",
            "Glendale, Arizona",
            "Glendale, California",
            "Grand Prairie, Texas",
            "Grand Rapids, Michigan",
            "Green Bay, Wisconsin",
            "Greensboro, North Carolina",
            "Gresham, Oregon",
            "Hampton, Virginia",
            "Hartford, Connecticut",
            "Hayward, California",
            "Henderson, Nevada",
            "Hialeah, Florida",
            "High Point, North Carolina",
            "Hollywood, Florida",
            "Honolulu, Hawaii",
            "Houston, Texas",
            "Huntington Beach, California",
            "Huntsville, Alabama",
            "Independence, Missouri",
            "Indianapolis, Indiana",
            "Inglewood, California",
            "Irvine, California",
            "Irving, Texas",
            "Jackson, Mississippi",
            "Jacksonville, Florida",
            "Jersey City, New Jersey",
            "Joliet, Illinois",
            "Kansas City",
            "Kansas",
            "Kansas City, Missouri",
            "Killeen, Texas",
            "Knoxville, Tennessee",
            "Lafayette, Louisiana",
            "Lakewood, Colorado",
            "Lancaster, California",
            "Lansing, Michigan",
            "Laredo, Texas",
            "Las Vegas, Nevada",
            "Lewisville, Texas",
            "Lexington, Kentucky",
            "Lincoln, Nebraska",
            "Little Rock, Arkansas",
            "Long Beach, California",
            "Los Angeles, California",
            "Louisville, Kentucky",
            "Lowell, Massachusetts",
            "Lubbock, Texas",
            "Madison, Wisconsin",
            "Manchester, New Hampshire",
            "McAllen, Texas",
            "McKinney, Texas",
            "Memphis, Tennessee",
            "Mesa, Arizona",
            "Mesquite, Texas",
            "Miami, Florida",
            "Miami Gardens, Florida",
            "Midland, Texas",
            "Milwaukee, Wisconsin",
            "Minneapolis, Minnesota",
            "Miramar, Florida",
            "Mobile, Alabama",
            "Modesto, California",
            "Montgomery, Alabama",
            "Moreno Valley, California",
            "Murfreesboro, Tennessee",
            "Naperville, Illinois",
            "Nashville, Tennessee",
            "New Haven, Connecticut",
            "New Orleans, Louisiana",
            "New York, New York",
            "Newark, New Jersey",
            "Newport News, Virginia",
            "Norfolk, Virginia",
            "Norman, Oklahoma",
            "North Las Vegas, Nevada",
            "Norwalk, California",
            "Oakland, California",
            "Oceanside, California",
            "Odessa, Texas",
            "Oklahoma City, Oklahoma",
            "Olathe, Kansas",
            "Omaha, Nebraska",
            "Ontario, California",
            "Orange, California",
            "Orlando, Florida",
            "Overland Park, Kansas",
            "Oxnard, California",
            "Palm Bay, Florida",
            "Palmdale, California",
            "Pasadena, Texas",
            "Pasadena, California",
            "Paterson, New Jersey",
            "Pembroke Pines, Florida",
            "Peoria, Arizona",
            "Peoria, Illinois",
            "Philadelphia, Pennsylvania",
            "Phoenix, Arizona",
            "Pittsburgh, Pennsylvania",
            "Plano, Texas",
            "Pomona, California",
            "Pompano Beach, Florida",
            "Port St. Lucie, Florida",
            "Portland, Oregon",
            "Providence, Rhode Island",
            "Provo, Utah",
            "Pueblo, Colorado",
            "Raleigh, North Carolina",
            "Rancho Cucamonga, California",
            "Reno, Nevada",
            "Richardson, Texas",
            "Richmond, California",
            "Richmond, Virginia",
            "Riverside, California",
            "Rochester, New York",
            "Rochester, Minnesota",
            "Rockford, Illinois",
            "Roseville, California",
            "Round Rock, Texas",
            "Sacramento, California",
            "Salem, Oregon",
            "Salinas, California",
            "Salt Lake City, Utah",
            "San Antonio, Texas",
            "San Bernardino, California",
            "San Buenaventura (Ventura), California",
            "San Diego, California",
            "San Francisco, California",
            "San Jose, California",
            "Santa Ana, California",
            "Santa Clara, California",
            "Santa Clarita, California",
            "Santa Rosa, California",
            "Savannah, Georgia",
            "Scottsdale, Arizona",
            "Seattle, Washington",
            "Shreveport, Louisiana",
            "Simi Valley, California",
            "Sioux Falls, South Dakota",
            "South Bend, Indiana",
            "Spokane, Washington",
            "Springfield, Missouri",
            "Springfield, Massachusetts",
            "Springfield, Illinois",
            "St. Louis, Missouri",
            "St. Paul, Minnesota",
            "St. Petersburg, Florida",
            "Stamford, Connecticut",
            "Sterling Heights, Michigan",
            "Stockton, California",
            "Sunnyvale, California",
            "Syracuse, New York",
            "Tacoma, Washington",
            "Tallahassee, Florida",
            "Tampa, Florida",
            "Tempe, Arizona",
            "Thornton, Colorado",
            "Thousand Oaks, California",
            "Toledo, Ohio",
            "Topeka, Kansas",
            "Torrance, California",
            "Tucson, Arizona",
            "Tulsa, Oklahoma",
            "Vallejo, California",
            "Vancouver, Washington",
            "Victorville, California",
            "Virginia Beach, Virginia",
            "Visalia, California",
            "Waco, Texas",
            "Warren, Michigan",
            "Washington, District of Columbia",
            "Waterbury, Connecticut",
            "West Covina, California",
            "West Jordan, Utah",
            "West Valley City, Utah",
            "Westminster, Colorado",
            "Wichita, Kansas",
            "Wichita Falls, Texas",
            "Wilmington, North Carolina",
            "Winston-Salem, North Carolina",
            "Worcester, Massachusetts",
            "Yonkers, New York"
    };

}
