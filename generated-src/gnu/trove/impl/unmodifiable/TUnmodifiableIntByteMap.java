///////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2008, Robert D. Eden All Rights Reserved.
// Copyright (c) 2009, Jeff Randall All Rights Reserved.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
///////////////////////////////////////////////////////////////////////////////

package gnu.trove.impl.unmodifiable;


//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////

////////////////////////////////////////////////////////////
// THIS IS AN IMPLEMENTATION CLASS. DO NOT USE DIRECTLY!  //
// Access to these methods should be through TCollections //
////////////////////////////////////////////////////////////


import gnu.trove.iterator.*;
import gnu.trove.procedure.*;
import gnu.trove.set.*;
import gnu.trove.list.*;
import gnu.trove.function.*;
import gnu.trove.map.*;
import gnu.trove.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Random;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class TUnmodifiableIntByteMap implements TIntByteMap, Serializable {
	private static final long serialVersionUID = -1034234728574286014L;

	private final TIntByteMap m;

	public TUnmodifiableIntByteMap( TIntByteMap m ) {
		if ( m == null )
			throw new NullPointerException();
		this.m = m;
	}

    @Override
	public int size()                       { return m.size(); }
    @Override
	public boolean isEmpty()                { return m.isEmpty(); }
    @Override
	public boolean containsKey( int key )   { return m.containsKey( key ); }
    @Override
	public boolean containsValue( byte val ) { return m.containsValue( val ); }
    @Override
	public byte get( int key)                { return m.get( key ); }

    @Override
	public byte put( int key, byte value ) { throw new UnsupportedOperationException(); }
    @Override
	public byte remove( int key ) { throw new UnsupportedOperationException(); }
    @Override
	public void putAll( TIntByteMap m ) { throw new UnsupportedOperationException(); }
    @Override
	public void putAll( Map<? extends Integer, ? extends Byte> map ) { throw new UnsupportedOperationException(); }
    @Override
	public void clear() { throw new UnsupportedOperationException(); }

	private transient TIntSet keySet = null;
	private transient TByteCollection values = null;

    @Override
	public TIntSet keySet() {
		if ( keySet == null )
			keySet = TCollections.unmodifiableSet( m.keySet() );
		return keySet;
	}
    @Override
	public int[] keys() { return m.keys(); }
    @Override
	public int[] keys( int[] array ) { return m.keys( array ); }

    @Override
	public TByteCollection valueCollection() {
		if ( values == null )
			values = TCollections.unmodifiableCollection( m.valueCollection() );
		return values;
	}
    @Override
	public byte[] values() { return m.values(); }
    @Override
	public byte[] values( byte[] array ) { return m.values( array ); }

    @Override
	public boolean equals(Object o) { return o == this || m.equals(o); }
    @Override
	public int hashCode()           { return m.hashCode(); }
    @Override
	public String toString()        { return m.toString(); }
    @Override
	public int getNoEntryKey()      { return m.getNoEntryKey(); }
    @Override
	public byte getNoEntryValue()    { return m.getNoEntryValue(); }

    @Override
	public boolean forEachKey( TIntProcedure procedure ) {
		return m.forEachKey( procedure );
	}
    @Override
	public boolean forEachValue( TByteProcedure procedure ) {
		return m.forEachValue( procedure );
	}
    @Override
	public boolean forEachEntry( TIntByteProcedure procedure ) {
		return m.forEachEntry( procedure );
	}

    @Override
	public TIntByteIterator iterator() {
		return new TIntByteIterator() {
			TIntByteIterator iter = m.iterator();

            @Override
			public int key() { return iter.key(); }
            @Override
			public byte value() { return iter.value(); }
            @Override
			public void advance() { iter.advance(); }
            @Override
			public boolean hasNext() { return iter.hasNext(); }
            @Override
			public byte setValue( byte val ) { throw new UnsupportedOperationException(); }
            @Override
			public void remove() { throw new UnsupportedOperationException(); }
		};
	}

    @Override
	public byte putIfAbsent( int key, byte value ) { throw new UnsupportedOperationException(); }
    @Override
	public void transformValues( TByteFunction function ) { throw new UnsupportedOperationException(); }
    @Override
	public boolean retainEntries( TIntByteProcedure procedure ) { throw new UnsupportedOperationException(); }
    @Override
	public boolean increment( int key ) { throw new UnsupportedOperationException(); }
    @Override
	public boolean adjustValue( int key, byte amount ) { throw new UnsupportedOperationException(); }
    @Override
	public byte adjustOrPutValue( int key, byte adjust_amount, byte put_amount ) { throw new UnsupportedOperationException(); }
}
