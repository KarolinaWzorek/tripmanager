package pl.edu.agh.mwo;

public class TripTest {

	public void addPhoto() {
		Trip trip = new Trip();
		Photo photo = new Photo();
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());

	}

	private void assertEquals(int i, int size) {
		// TODO Auto-generated method stub
		
	}

	
	}


