package org.apache.lucene.spatial.base.prefix;

import org.apache.lucene.spatial.base.prefix.SpatialPrefixTree;
import org.apache.lucene.spatial.base.prefix.quad.QuadPrefixTree;
import org.apache.lucene.spatial.base.shape.Shape;
import org.apache.lucene.spatial.base.shape.simple.PointImpl;
import org.apache.lucene.spatial.base.shape.simple.RectangleImpl;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;


/**
 */
public class TestGridMatchInfo {

  @Test @Ignore
  public void testMatchInfo() {
    // Check Validatio
    QuadPrefixTree grid = new QuadPrefixTree(0, 10, 0, 10, 2);


//    GeometricShapeFactory gsf = new GeometricShapeFactory();
//    gsf.setCentre( new com.vividsolutions.jts.geom.Coordinate( 5,5 ) );
//    gsf.setSize( 9.5 );
//    Shape shape = new JtsGeometry( gsf.createCircle() );

    Shape shape = new RectangleImpl(0, 6, 5, 10);

    shape = new PointImpl(3, 3);

    //TODO UPDATE BASED ON NEW API
    List<String> m = SpatialPrefixTree.nodesToTokenStrings(grid.getNodes(shape,3,false));
    System.out.println(m);

    for (CharSequence s : m) {
      System.out.println(s);
    }


//    // query should intersect everything one level down
//    ArrayList<String> descr = new ArrayList<String>();
//    descr.add( "AAA*" );
//    descr.add( "AABC*" );
//    System.out.println( descr );
  }
}