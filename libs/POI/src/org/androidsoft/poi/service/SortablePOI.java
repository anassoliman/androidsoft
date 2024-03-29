/* Copyright (c) 2010-2012 Pierre LEVY androidsoft.org
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.androidsoft.poi.service;

import org.androidsoft.poi.model.POI;

/**
 * Limited POI object used for distance sorting in order to find nearest points
 * @author pierre
 */
public class SortablePOI implements Comparable
{
    long dist;
    POI poi;

    SortablePOI( POI poi , double lat , double lon )
    {
        this.poi = poi;
        dist = LocationService.getDistance(poi, lat, lon);
        
    }

    @Override
    public int compareTo(Object t)
    {
        return (int) ( this.dist - ((SortablePOI) t).dist );
    }


}
